package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V>  {

	private int capacity = 4, size = 0;
	private static float loadFactorThreshold = 0.75f;
	
	LinkedList<Entry<K, V>>[] table;
	
	public MyHashMap() {
		table = new LinkedList[capacity];
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K k, V v) {
		if(get(k) != null) {
			int index = hash(k.hashCode());
			LinkedList<Entry<K, V>> temp = table[index];
			for(Entry<K, V> entry : temp) {
				if(entry.getK().equals(k)) {
					V oldValue = entry.getV();
					entry.setV(v);
					return oldValue;
				}
			}
		}
		if(size >= capacity * loadFactorThreshold) 
			ensureExtraCapacity();
		int index = hash(k.hashCode());
		if(table[index] == null)
			table[index] = new LinkedList<>();
		table[index].add(new Entry<K, V>(k, v));
		size++;
		return v;
	}

	@Override
	public V get(K k) {
		int index = hash(k.hashCode());
		if(table[index] != null) {
			LinkedList<Entry<K, V>> temp = table[index];
			for(Entry<K, V> entry : temp)
				if(entry.getK().equals(k)) return entry.getV();
		}
		return null;
	}

	@Override
	public boolean containtsKey(K k) {
		if(get(k) != null) return true;
		return false;
	}

	@Override
	public boolean containsValue(V v) {
		for(int i = 0; i < capacity; i++) {
			if(table[i] != null) {
				LinkedList<Entry<K, V>> temp = table[i];
				for(Entry<K, V> entry : temp)
					if(entry.getV().equals(v)) return true;
			}
		}
		return false;
	}

	@Override
	public Set<K> keyset() {
		Set<K> keys = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(table[i] != null) {
				LinkedList<Entry<K, V>> temp = table[i];
				for(Entry<K, V> entry : temp)
					keys.add(entry.getK());
			}
		}
		return keys;
	}

	@Override
	public Set<V> values() {
		Set<V> values = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(table[i] != null) {
				LinkedList<Entry<K, V>> temp = table[i];
				for(Entry<K, V> entry : temp)
					values.add(entry.getV());
			}
		}
		return values;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> entries = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(table[i] != null) {
				LinkedList<Entry<K, V>> temp = table[i];
				for(Entry<K, V> entry : temp)
					entries.add(entry);
			}
		}
		return entries;
	}

	@Override
	public void remove(K k) {
		int index = hash(k.hashCode());
		if(table[index] != null) {
			LinkedList<Entry<K, V>> temp = table[index];
			for(Entry<K, V> entry : temp) {
				if(entry.getK().equals(k)) {
					temp.remove(entry);
					size--;
					break;
				}
			}
		}
	}

	@Override
	public void clear() {
		size = 0;
		removeEntries();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < capacity; i++) {
			if(table[i] != null && table[i].size() > 0) {
				for(Entry<K, V> entry : table[i])
					builder.append(entry);
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	// _________________ helper methods _________________
	
	private void ensureExtraCapacity() {
		capacity <<= 1;// same as capacity *= 2 but more efficient
		table = Arrays.copyOf(table, capacity);
	}
	
	private void removeEntries() {
		for(int i = 0; i < capacity; i++)
			if(table[i] != null) table[i].clear();
	}

	private int hash(int hashCode) {
		return supplementalHash(hashCode) & (capacity - 1);
	}

	private int supplementalHash(int hashCode) {
		hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
		return hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
	}
	
}

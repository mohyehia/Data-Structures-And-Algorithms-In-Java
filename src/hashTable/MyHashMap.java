package hashTable;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V> {

	private int capacity = 4, size = 0;
	private float loadFactorThreshold = 0.75f;
	private LinkedList<Entry<K, V>>[] data;
	
	public MyHashMap() {
		data = new LinkedList[capacity];
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
	public V put(K key, V value) {
		if(get(key) != null) {
			int index = hash(key.hashCode());
			for(Entry<K, V> entry : data[index]) {
				if(entry.getKey().equals(key)) {
					V oldValue = entry.getValue();
					entry.setValue(value);
					return oldValue;
				}
			}
		}
		ensureExtraCapacity();
		int index = hash(key.hashCode());
		if(data[index] == null)
			data[index] = new LinkedList<>();
		data[index].add(new Entry<K, V>(key, value));
		size++;
		return value;
	}

	@Override
	public V get(K key) {
		int index = hash(key.hashCode());
		if(data[index] != null) {
			for(Entry<K, V> entry : data[index])
				if(entry.getKey().equals(key)) return entry.getValue();
		}
		return null;
	}

	@Override
	public boolean containtsKey(K key) {
		if(get(key) != null) return true;
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(Entry<K, V> entry :data[i])
					if(entry.getValue().equals(value)) return true;
			}
		}
		return false;
	}

	@Override
	public Set<K> keyset() {
		Set<K> keys = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(Entry<K, V> entry : data[i])
					keys.add(entry.getKey());
			}
		}
		return keys;
	}

	@Override
	public Set<V> values() {
		Set<V> values = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(Entry<K, V> entry : data[i])
					values.add(entry.getValue());
			}
		}
		return values;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> entries = new HashSet<>();
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(Entry<K, V> entry : data[i])
					entries.add(entry);
			}
		}
		return entries;
	}

	@Override
	public void remove(K key) {
		int index = hash(key.hashCode());
		if(data[index] != null) {
			for(Entry<K, V> entry : data[index]) {
				if(entry.getKey().equals(key)) {
					data[index].remove(entry);
					size--;
					break;
				}
			}
		}
	}

	@Override
	public void clear() {
		removeEntries();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(Entry<K, V> entry :data[i])
					builder.append(entry);
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	//helper methods
	
	private void ensureExtraCapacity() {}
	
	private void removeEntries() {
		for(int i = 0; i < capacity; i++)
			if(data[i] != null) data[i].clear();
		size = 0;
	}
	
	private int hash(int hashCode) {
		return supplementalHash(hashCode) & (capacity - 1);
	}

	private int supplementalHash(int hashCode) {
		hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
		return hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
	}
	
}

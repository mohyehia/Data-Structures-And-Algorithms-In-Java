package map;

import java.util.Set;

public interface MyMap<K, V> {
	/**
	 * 
	 * @return number of entries in this map
	 */
	int size();
	/**
	 * 
	 * @return true if this map doesn't contain any entries
	 */
	boolean isEmpty();
	/**
	 * Add an entry (key, value) into the map
	 * @param k
	 * @param v
	 * @return
	 */
	V put(K k, V v);
	/**
	 * 
	 * @param k
	 * @return the value that matches the specified key
	 */
	V get(K k);
	/**
	 * 
	 * @param k
	 * @return true if the specified key is in the map
	 */
	boolean containtsKey(K k);
	/**
	 * 
	 * @param v
	 * @return true if this map contains the specified value
	 */
	boolean containsValue(V v);
	/**
	 * 
	 * @return a set consisting of the keys in this map
	 */
	Set<K> keyset();
	/**
	 * 
	 * @return a set consisting of the values in this map
	 */
	Set<V> values();
	/**
	 * 
	 * @return a set of entries in the map
	 */
	Set<Entry<K, V>> entrySet();
	/**
	 * Remove an entry for the specified key
	 * @param k
	 */
	void remove(K k);
	/**
	 * Remove all of the entries from this map
	 */
	void clear();
}

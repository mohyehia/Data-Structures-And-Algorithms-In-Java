package hashTable;

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
	 * @param key
	 * @param value
	 * @return
	 */
	V put(K key, V value);
	/**
	 * 
	 * @param key
	 * @return the value that matches the specified key
	 */
	V get(K key);
	/**
	 * 
	 * @param key
	 * @return true if the specified key is in the map
	 */
	boolean containsKey(K key);
	/**
	 * 
	 * @param value
	 * @return true if this map contains the specified value
	 */
	boolean containsValue(V value);
	/**
	 * 
	 * @return a set consisting of the keys in this map
	 */
	Set<K> keySet();
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
	 * @param key
	 */
	void remove(K key);
	/**
	 * Remove all of the entries from this map
	 */
	void clear();
}

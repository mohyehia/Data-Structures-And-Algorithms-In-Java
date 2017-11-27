package map;
public class Entry<K, V> {
	private K k;
	private V v;
	public Entry(K k, V v) {
		this.k = k;
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Entry [k=" + k + ", v=" + v + "]";
	}
}

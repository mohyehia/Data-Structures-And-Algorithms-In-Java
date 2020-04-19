package hashTable;

public class Test {
	public static void main(String[] args) {
		MyMap<Integer, String> map = new MyHashMap<>();
		map.put(1, "mohammed");
		map.put(2, "ahmed");
		map.put(3, "omar");
		map.put(4, "ali");
		map.put(5, "amr");
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue("omar"));
		System.out.println(map.size());
		System.out.println(map);
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry);
		map.clear();
		System.out.println(map);
	}
}

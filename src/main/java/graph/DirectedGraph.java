package graph;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DirectedGraph implements Runnable {
	BufferedReader in;
	PrintWriter out;
	StringTokenizer st;
	public static void main(String[] args) {
		new DirectedGraph().run();
	}
	void solve() {
		int numOfNodes = readInt(), numOfEdges = readInt();
		List<Integer>[] graph = new List[numOfNodes];
		for(int i = 0; i < numOfNodes; i++)
			graph[i] = new ArrayList<>();
		int nodeFrom, nodeTo;
		for(int i = 0; i < numOfEdges; i++){
			nodeFrom = readInt();
			nodeTo = readInt();
			graph[nodeFrom].add(nodeTo);
			//graph[nodeTo].add(nodeFrom);
		}
		for(int i = 0; i < numOfNodes; i++)
			System.out.println(i + " => " + graph[i]);
	}
	void init() {
		try {
			in = new BufferedReader(new FileReader("input.txt"));
			out = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new BufferedOutputStream(System.out));
		}
	}
	@Override
	public void run() {
		try {
			init();
			startTime = System.currentTimeMillis();
			totalMemory = Runtime.getRuntime().totalMemory()
					- Runtime.getRuntime().freeMemory();
			solve();
			out.close();
			in.close();
			if (System.getProperty("ONLINE_JUDGE") == null) {
				time();
				memory();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	long startTime, endTime, totalMemory, freeMemory;
	void time() {
		endTime = System.currentTimeMillis();
		System.err.println("Time => "
				+ (int) (((endTime - startTime) / 1000) % 60) + " ms");
	}
	void memory() {
		freeMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		System.err.println(
				"Memory => " + ((totalMemory - freeMemory) >> 10) + " KB");
	}
	String read() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(in.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
	int readInt() {
		return Integer.parseInt(read());
	}
	long readLong() {
		return Long.parseLong(read());
	}
	double readDouble() {
		return Double.parseDouble(read());
	}
	char readChar() {
		return read().charAt(0);
	}
	int[] readIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = readInt();
		return a;
	}
	long[] readLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = readLong();
		return a;
	}
	double[] readDoubleArray(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = readDouble();
		return a;
	}
	String[] readStringArray(int n) {
		String[] s = new String[n];
		for (int i = 0; i < n; i++)
			s[i] = read();
		return s;
	}
	char[] readCharArray(int n) {
		char[] ch = new char[n];
		for (int i = 0; i < n; i++)
			ch[i] = readChar();
		return ch;
	}
	String readLine() {
		String str = "";
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

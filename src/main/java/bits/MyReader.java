package bits;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class MyReader {
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		Reader in = new Reader();
		
		in.close();
		out.close();
	}
	
	static PrintWriter out;
	static class Reader {
		BufferedReader br;
		StringTokenizer st;
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String read() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int readInt() {return Integer.parseInt(read());}
		long readLong() {return Long.parseLong(read());}
		double readDouble() {return Double.parseDouble(read());}
		char readChar() {return read().charAt(0);}
		int[] readIntArray(int n){
			int[] a = new int[n];
			for(int i = 0; i < n; i++) a[i] = readInt();
			return a;
		}
		long[] readLongArray(int n){
			long[] a = new long[n];
			for(int i = 0; i < n; i++) a[i] = readLong();
			return a;
		}
		double[] readDoubleArray(int n){
			double[] a = new double[n];
			for(int i = 0; i < n; i++) a[i] = readDouble();
			return a;
		}
		String[] readStringArray(int n){
			String[] s = new String[n];
			for(int i = 0; i < n; i++) s[i] = read();
			return s;
		}
		char[] readCharArray(int n){
			char[] ch = new char[n];
			for(int i = 0; i < n; i++) ch[i] = readChar();
			return ch;
		}
		String readLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		void close(){
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// --------------------------------------------------------
}

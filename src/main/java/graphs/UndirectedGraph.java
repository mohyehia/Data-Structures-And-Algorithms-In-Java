package graphs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UndirectedGraph {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfNodes = in.nextInt(), numOfEdges = in.nextInt();
		List<Integer>[] graph = new List[numOfNodes];
		for(int i = 0; i < numOfNodes; i++)
			graph[i] = new ArrayList<>();
		int nodeFrom, nodeTo;
		for(int i = 0; i < numOfEdges; i++) {
			nodeFrom = in.nextInt();
			nodeTo = in.nextInt();
			graph[nodeFrom].add(nodeTo);
			graph[nodeTo].add(nodeFrom);
		}
		for(int i = 0; i < numOfNodes; i++)
			System.out.println(i + " => " + graph[i]);
		in.close();
	}
}

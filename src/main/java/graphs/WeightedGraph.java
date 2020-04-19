package graphs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class WeightedGraph {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfNodes = in.nextInt(), numOfEdges = in.nextInt();
		List<Node>[] graph = new List[numOfNodes];
		for(int i = 0; i < numOfNodes; i++)
			graph[i] = new ArrayList<>();
		int nodeFrom, nodeTo, cost;
		for(int i = 0; i < numOfEdges; i++) {
			nodeFrom = in.nextInt();
			nodeTo = in.nextInt();
			cost = in.nextInt();
			graph[nodeFrom].add(new Node(nodeTo, cost));
		}
		for(int i = 0; i < numOfNodes; i++)
			System.out.println(i + " => " + graph[i]);
		in.close();
	}
	static class Node {
		int node, cost;
		public Node(int node, int cost) {
			this.node = node;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "(" + node + ", " + cost + ")";
		}
	}
}

package graphs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UndirectedGraph {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfNode = in.nextInt(), numOfEdges = in.nextInt();
		List<Integer>[] graph = new List[numOfNode];
		for(int i = 0; i < numOfNode; i++)
			graph[i] = new ArrayList<>();
		int nodeFrom, nodeTo;
		for(int i = 0; i < numOfEdges; i++){
			nodeFrom = in.nextInt();
			nodeTo = in.nextInt();
			graph[nodeFrom].add(nodeTo);
			graph[nodeTo].add(nodeFrom);
		}
		in.close();
		for(int i = 0; i < numOfNode; i++)
			System.out.println(i + " => " + graph[i]);
	}
}

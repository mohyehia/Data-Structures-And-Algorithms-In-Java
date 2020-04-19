package graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class BFS {
	static List<Integer>[] graph;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfNodes = in.nextInt(), numOfEdges = in.nextInt();
		graph = new List[numOfNodes];
		for(int i = 0; i < numOfNodes; i++)
			graph[i] = new ArrayList<>();
		int nodeFrom, nodeTo;
		for(int i = 0; i < numOfEdges; i++){
			nodeFrom = in.nextInt();
			nodeTo = in.nextInt();
			graph[nodeFrom].add(nodeTo);
			//graph[nodeTo].add(nodeFrom);
		}
		in.close();
		visited = new boolean[numOfNodes];
		bfs(0);
	}
	static void bfs(int root){
		Queue<Integer> q = new LinkedList<>();
		visited[root] = true;
		q.add(root);
		while(! q.isEmpty()){
			int temp = q.remove();
			System.out.println(temp);
			for(int i : graph[temp]){
				if(! visited[i]){
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
}

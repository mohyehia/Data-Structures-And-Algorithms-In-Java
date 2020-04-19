package graphs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class DFS {
	static boolean[] visited;
	static List<Integer>[] graph;
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
		}
		in.close();
		visited = new boolean[numOfNodes];
		dfs(0);
		//iterativeDfs(0);
	}
	//recursive approach for dfs
	static void dfs(int node){
		visited[node] = true;
		System.out.println(node);
		for(int i : graph[node])
			if(!visited[i]) dfs(i);
	}
	//iterative approach for dfs using stack
	static void iterativeDfs(int node){
		Stack<Integer> st = new Stack<>();
		visited[node] = true;
		st.push(node);
		while(!st.isEmpty()){
			int temp = st.pop();
			System.out.println(temp);
			for(int i : graph[temp]){
				if(!visited[i]){
					visited[i] = true;
					st.push(i);
				}
			}
		}
	}
}

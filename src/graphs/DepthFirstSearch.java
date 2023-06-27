package graphs;

import java.util.List;

public class DepthFirstSearch {
    private void dfs(List<List<Integer>> graph){
        int N = graph.size();
        boolean[] visited = new boolean[N];
         dfs(0, graph,visited);
    }
    private void dfs(int node, List<List<Integer>> graph, boolean[]visited){
        visited[node]= true;
        for (int neighbour: graph.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour, graph,visited);
            }
        }
    }
}

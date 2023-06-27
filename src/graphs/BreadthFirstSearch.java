package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    private void bfs(int startNode, List<List<Integer>> graph,int[]distance){
        int INF = Integer.MAX_VALUE;
        distance[startNode]=0;
        Queue<Integer> queue= new LinkedList<>();
        queue.add(startNode);

        while(!queue.isEmpty()){
            int node = queue.poll();

            for (int neighbour: graph.get(node)){
                if (distance[neighbour]==INF){
                    distance[neighbour]= distance[node]+1;
                    bfs(neighbour,graph,distance);
                }
            }
        }
    }
}

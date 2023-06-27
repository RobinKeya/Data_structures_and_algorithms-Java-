package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//given a directed graph, design an algorithm to find out whether there's a route between two nodes
public class PathBetweenNodes {
    private boolean routeBetweenTwoNodes(List<List<Integer>> graph, int x, int y){
        int INF = Integer.MAX_VALUE;
        int N = graph.size();
        int[] distance = new int[N];
        Arrays.fill(distance,INF);
        Queue<Integer>queue = new LinkedList<>();
        queue.add(x);
        distance[x]= 0;

        while (!queue.isEmpty()){
            int node = queue.poll();

            for (int neighbour : graph.get(node)){
                if (neighbour == y) return true;
                if (distance[neighbour]==INF){
                    queue.add(neighbour);
                    distance[neighbour]=distance[node +1];
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        List<List<Integer>> graph = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(0,2),
                Arrays.asList(0,1,3),
                Arrays.asList(2)
        );
        PathBetweenNodes obj = new PathBetweenNodes();
        System.out.println(obj.routeBetweenTwoNodes(graph, 2,3));
    }
}

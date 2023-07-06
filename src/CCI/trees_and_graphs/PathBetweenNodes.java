package CCI.trees_and_graphs;

import common.Graph;
import common.Node;
import common.State;

import java.util.LinkedList;
import java.util.Queue;

public class PathBetweenNodes {
    private static boolean findIfPathExists(Graph g, Node x, Node y){
        Queue<Node> queue = new LinkedList<>();
        for (Node u : g.nodes){
            u.state = State.Unvisited;
        }
        queue.add(x);
        x.state = State.Visiting;
        while (!queue.isEmpty()){
            Node u = queue.remove();
            if (u != null){
                for (Node neighbour: u.children){
                    if (neighbour.state == State.Unvisited){
                        if (neighbour.name == y.name)return  true;
                        else {
                            queue.add(neighbour);
                            neighbour.state = State.Visiting;
                        }
                    }
                }
            }
            u.state = State.Visited;
        }
        return false;
    }
}

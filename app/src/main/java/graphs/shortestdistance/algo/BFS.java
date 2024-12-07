package graphs.shortestdistance.algo;

import graphs.implementation.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
    Graph graph = new Graph();

    public static void main(String[] args) {

        BFS bfs = new BFS();
        bfs.graph.addNodes(0, 1);
        bfs.graph.addNodes(1, 2);
        bfs.graph.addNodes(2, 3);
        bfs.graph.addNodes(3, 4);

        System.out.println(bfs.getShortestDistance(bfs.graph, 4));

        bfs.graph.addNodes(1, 4);
        System.out.println(bfs.getShortestDistance(bfs.graph, 4));

    }

    public int getShortestDistance(Graph graph, int target) {
        int distance = 0;
        Queue<Integer[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(new Integer[]{0, 0});
        visited.add(0);
        while (!queue.isEmpty()) {
            Integer[] node = queue.poll();
            int element = node[0];
            int weight = node[1];
            if (element == target) {
                return weight;
            }
            if (graph.graph.get(element) != null) {
                for (Integer[] adj : graph.graph.get(element)) {
                    if (!visited.contains(adj[0])) {
                        queue.add(new Integer[]{adj[0], weight + 1});
                        visited.add(adj[0]);
                    }
                }
            }
        }
        return distance;
    }
}

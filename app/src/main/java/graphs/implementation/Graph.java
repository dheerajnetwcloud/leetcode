package graphs.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    public HashMap<Integer, List<Integer[]>> graph = new HashMap<>();
    public void addNodes(int source, int vertex){
        graph.computeIfAbsent(source, k -> new ArrayList<>());
        graph.get(source).add(new Integer[]{vertex, 0});
    }

    public void addNodes(int source, int vertex, int distance){
        graph.computeIfAbsent(source, k -> new ArrayList<>());
        graph.get(source).add(new Integer[]{vertex, distance});
    }
}

import Graphs.Edge;
import Graphs.UndirectedGraph;

import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        UndirectedGraph<String> graph;

        graph = new UndirectedGraph<>();

        graph.insertVertex("p");
        graph.insertVertex("r");
        graph.insertVertex("q");
        graph.insertVertex("t");
        graph.insertVertex("s");
        graph.insertVertex("u");
        graph.insertVertex("x");
        graph.insertVertex("w");
        graph.insertVertex("v");


        graph.insertEdge("p", "r", 2);
        graph.insertEdge("p", "q", 2);
        graph.insertEdge("q", "t", 1);
        graph.insertEdge("p", "s", 1);
        graph.insertEdge("s", "u", 1);
        graph.insertEdge("u", "x", 1);
        graph.insertEdge("u", "w", 1);
        graph.insertEdge("w", "v", 1);


//        graph.showAsIncidenceMatrix();
//        graph.showAsAdjacencyMatrix();
//        graph.showAsAdjacencyList();
//
//        System.out.println("\nAfter Kruskal's algorithm\n ");
//
//        graph.convertToMinimumSpanningTree();
//        graph.showAsAdjacencyMatrix();
//        graph.showAsAdjacencyList();

        graph.showDeepFirstSearchResult();






    }
}

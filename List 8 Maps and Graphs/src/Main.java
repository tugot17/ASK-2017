import Graphs.Edge;
import Graphs.UndirectedGraph;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        UndirectedGraph<String> graph;

        graph = new UndirectedGraph<>();

        graph.insertVertex("p");
        graph.insertVertex("r");
        graph.insertVertex("s");
        graph.insertVertex("q");
//        graph.insertVertex("t");
//        graph.insertVertex("u");
//        graph.insertVertex("v");
//        graph.insertVertex("w");
//        graph.insertVertex("x");


        graph.insertEdge("p", "q", 2);
        graph.insertEdge("p", "s",2);
        graph.insertEdge("p", "r",6);
        graph.insertEdge("r", "q", 1);


        graph.showAsIncidenceMatrix();

        System.out.println("\nAfter Kruskal's algorithm\n ");


        graph.convertToMinimumSpanningTree();


    }
}

import Graphs.UndirectedGraph;

public class Main {

    public static void main(String[] args) {

        UndirectedGraph<Integer> graph;

        graph = new UndirectedGraph<>();

        graph.insertVertex(12);
        graph.insertVertex(10);
        graph.insertVertex(3);

        graph.insertEdge(12, 10);
        graph.insertEdge(3, 10);
        graph.insertEdge(3, 12);

        graph.showAsAdjacencyMatrix();


    }
}

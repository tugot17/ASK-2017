package Graphs;

/**
 * Created by pmazurek on 6/6/2017.
 */
public class Edge implements Comparable<Edge>, Cloneable {

    Vertex beginning;

    Vertex end;

    int weight;


    public Edge(Vertex beginning, Vertex end, int weight) {
        this.beginning = beginning;
        this.end = end;
        this.weight = weight;
    }

    public Edge(Vertex beginning, Vertex end) {
        this.beginning = beginning;
        this.end = end;
        this.weight = 1;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

package Graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class Vertex <T> {

    T value;

    List<Vertex> linkedVertices = new LinkedList<Vertex>();

    public Vertex(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value.toString();
    }

}

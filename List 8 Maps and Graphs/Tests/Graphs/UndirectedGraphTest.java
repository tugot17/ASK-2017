package Graphs;

import Interfaces.Graphs.IGraph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 6/5/2017.
 */
public class UndirectedGraphTest {

    UndirectedGraph<Integer> graph;

    @Before
    public void setUp() throws Exception {
        graph = new UndirectedGraph<>();

        graph.insertVertex(12);
        graph.insertVertex(10);
        graph.insertVertex(3);


    }

    @Test
    public void insertVertex() throws Exception {

        Assert.assertTrue( graph.getVertices().get(0).value.equals(12)) ;
    }

    @Test
    public void insertEdge() throws Exception {
        graph.insertEdge(12, 10);

        Assert.assertEquals(12, graph.getEdges().get(0).beginning.value);


    }

    @Test
    public void insertEdge2() throws Exception {
        graph.insertEdge(12, 10);

        Assert.assertEquals(10, graph.getEdges().get(0).end.value);


    }

}
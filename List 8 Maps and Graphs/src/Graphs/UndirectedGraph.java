package Graphs;

import Interfaces.Graphs.IGraph;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class UndirectedGraph<T> implements IGraph <T>{

    //<editor-fold desc="Elements">
    private LinkedList <Vertex> vertices = new LinkedList<>();

    private LinkedList <Edge> edges = new LinkedList<>();
    //</editor-fold>

    public LinkedList<Vertex> getVertices() {
        return vertices;
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }

    @Override
    public void insertVertex(T value) {

        vertices.add(new Vertex(value));
    }

    @Override
    public void insertEdge(T firstVal, T secVal) {

        insertEdge(firstVal,secVal, 1);
    }

    @Override
    public void insertEdge(T firstVal, T secVal, int length) {


        Vertex beginning = findVertex(firstVal);
        Vertex end = findVertex(secVal);

        Edge edge = new Edge(beginning, end, length);
        edges.add(edge);

        beginning.linkedVertices.add(end);
        end.linkedVertices.add(beginning);

        beginning.linkedEdges.add(edge);
        end.linkedVertices.add(edge);
    }

    @Override
    public void deleteVertex(T value) {

        Vertex removable = findVertex(value);

        if (removable == null)
            throw new NoSuchElementException(value.toString());

        vertices.remove(removable);

    }

    @Override
    public void deleteEdge(T firstVal, T secVal) {

//        edges.remove()
    }

    @Override
    public void showAsAdjacencyMatrix() {

        int matrixSize = vertices.size() + 1;

        Object matrix [][] = new Object[matrixSize][matrixSize];

        matrix[0][0] = asManyWhitespacesAsNecessary(matrix.length);
        
        putVertexValuesInFirstRowAndColumn(matrix);

        fillMatrixWithVertexReferenceData(matrix);
        
        showMatrix(matrix);

    }

    @Override
    public void showAsAdjacencyList() {

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).value +  ": ");
            for (int j = 0; j < vertices.get(i).linkedVertices.size(); j++ ) {
                Vertex vertex = (Vertex) vertices.get(i).linkedVertices.get(j);
                System.out.print(vertex.value + ", ");
            }
            System.out.print(" /");
            System.out.println();
            }


//        for (Vertex vertex : vertices) {
//
//        }

    }

    @Override
    public void showAsIncidenceMatrix() {

        int verticesAmount = vertices.size() + 1;

        int edgesAmount = edges.size() + 1;


        Object matrix [][] = new Object [edgesAmount] [verticesAmount];

        matrix[0][0] =asManyWhitespacesAsNecessary(matrix.length);

        putVertexValueInFirstRowAndEdgesIndexesInFirstColumn(matrix);

        fillMatrixWithVertexToEdgeReferenceData(matrix);

        showMatrix(matrix);

    }

    @Override
    public void convertToMinimumSpanningTree() {

        boolean edgeEssential = false;

        LinkedList<Vertex> vertices1 = new LinkedList<>();
        LinkedList<Edge> essentialEdges = new LinkedList<>();

        edges.sort(Edge::compareTo);

        for (Edge e: edges) {
            if ( !vertices1.contains(e.beginning)) {
                vertices1.add(e.beginning);
                edgeEssential = true;
            }

            if ( !vertices1.contains(e.end)) {
                vertices1.add(e.end);
                edgeEssential = true;
            }

            if (edgeEssential)
                essentialEdges.add(e);

            edgeEssential = false;

        }

            edges = essentialEdges;

    }


    //<editor-fold desc="Private Methods">
    private void putVertexValuesInFirstRowAndColumn(Object[][] matrix) {


        for (int i = 1; i < matrix[0].length; i++) {
             matrix[0][i] = vertices.get(i - 1).value;
        }

        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = vertices.get(i - 1).value;
        }

    }

    private Vertex findVertex(T value) {

        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value))
                return vertex;
        }

        throw new NoSuchElementException(value.toString());
    }

    private void showMatrix(Object[][] matrix) {

        for (Object[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");

                if (aMatrix[j].toString().length() < 2)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    private void fillMatrixWithVertexReferenceData(Object[][] matrix) {

        for (int i = 1; i < matrix.length; i ++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (referenceBetweenVerticesExist(i, j))
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }

    }

    private boolean referenceBetweenVerticesExist(int i, int j) {


        Vertex firstVertex = vertices.get(i - 1);

        Vertex secondVertex = vertices.get(j - 1);

        return firstVertex.linkedVertices.contains(secondVertex);
    }

    private void fillMatrixWithVertexToEdgeReferenceData(Object[][] matrix) {

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (referenceBetweenVertexAndEdgeExists(i - 1, j - 1))
                    matrix[i][j] = 1;
                else
                    matrix[i] [j] = 0;
            }
        }

    }

    private boolean referenceBetweenVertexAndEdgeExists(int edgeId, int vertexId)  {

        Edge edge = edges.get(edgeId);

        Vertex vertex = vertices.get(vertexId);

        return (edge.beginning == vertex || edge.end == vertex);
    }

    private void putVertexValueInFirstRowAndEdgesIndexesInFirstColumn(Object[][] matrix) {

        for (int i = 1; i < matrix[0].length; i++) {
            matrix[0][i] = vertices.get(i - 1).value;
        }

        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = i;
        }
    }

    private String asManyWhitespacesAsNecessary(int length) {

        StringBuilder result = new StringBuilder();

        while (length > 0) {
            result.append(" ");

            length /= 10;

        }

        return result.toString();
    }
    //</editor-fold>

}

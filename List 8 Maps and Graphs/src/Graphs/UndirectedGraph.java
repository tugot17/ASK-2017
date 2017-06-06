package Graphs;

import Interfaces.Graphs.IGraph;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class UndirectedGraph<T> implements IGraph <T>{

    //<editor-fold desc="Elements">
    private List <Vertex> vertices = new LinkedList<>();

    private List <Edge> edges = new LinkedList<>();
    //</editor-fold>

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public void insertVertex(T value) {

        vertices.add(new Vertex(value));
    }

    @Override
    public void insertEdge(T firstVal, T secVal) {

        Vertex begenning = findVertex(firstVal);

        Vertex end = findVertex(secVal);

        edges.add(new Edge(begenning, end));

        begenning.linkedVertices.add(end);

        end.linkedVertices.add(begenning);
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

        matrix[0][0] = " ";
        
        putVertexNamesInFirstRowAndColumn(matrix);

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



    }

    @Override
    public void showAsIncidenceMatrix() {

    }

    //<editor-fold desc="Private Methods">
    private void putVertexNamesInFirstRowAndColumn(Object[][] matrix) {

//        Object [] verticesArray = (Vertex[]) vertices.toArray();

        for (int i = 1; i < matrix[0].length; i++) {
//            matrix[0][i] = verticesArray[i - 1].value;
             matrix[0][i] = vertices.get(i - 1);
        }

        for (int i = 1; i < matrix.length; i++) {
//            matrix[i][0] = verticesArray[i - 1].value;
            matrix[i][0] = vertices.get(i - 1);
        }

    }

    private Vertex findVertex(T value) {

        // #todo czemu tu iterator nie działa ogarnąć trzeba bo nie wygląda to fajnie tak jak wygląda teraz

        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).value.equals(value))
                return vertices.get(i);
        }
        return null;
    }

    private void showMatrix(Object[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j].toString().length() < 2)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    private void fillMatrixWithVertexReferenceData(Object[][] matrix) {

        for (int i = 1; i < matrix[0].length; i ++) {
            for (int j = 1; j < matrix.length; j++) {
                if (referenceExist(i, j))
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }

    }

    private boolean referenceExist(int i, int j) {


        Vertex firstVertex = vertices.get(i - 1);

        Vertex secondVertex = vertices.get(j - 1);

        return firstVertex.linkedVertices.contains(secondVertex);
    }
    //</editor-fold>

}

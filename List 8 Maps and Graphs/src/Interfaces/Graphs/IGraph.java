package Interfaces.Graphs;

/**
 * Created by pmazurek on 6/5/2017.
 */
public interface IGraph <T> {

    void insertVertex(T value);

    void insertEdge (T firstVal, T secVal);

    void insertEdge(T firstVal, T secVal, int length);

    void deleteVertex (T value);

    void deleteEdge(T firstVal, T secVal);

    void showAsAdjacencyMatrix();

    void showAsAdjacencyList();

    void showAsIncidenceMatrix();

    void convertToMinimumSpanningTree();

    void showBreadthFirstSearchResult();

    void showDeepFirstSearchResult();
}

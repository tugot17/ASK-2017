package BST;

/**
 * Created by pmazurek on 13.05.2017.
 */
public interface IBst <T extends Comparable<T>>{

     String toStringInOrder();

     String toStringPreOrder();

     String toStringPostOrder();

     Node<T> findBiggestElement();

     Node<T> findSmallestElement();

     void insertElement(T value);

     T removeElement();

     int getBstHeight(Node<Integer> value);

     Node<T> getRoot();

}

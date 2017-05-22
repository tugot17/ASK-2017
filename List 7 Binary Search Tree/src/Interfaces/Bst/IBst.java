package Interfaces.Bst;

import BST.Node;

/**
 * Created by pmazurek on 13.05.2017.
 */
public interface IBst <T extends Comparable<T>>{

     String toStringInOrder();

     String toStringPreOrder();

     String toStringPostOrder();

     int getBstHeight(Node<Integer> value);

}

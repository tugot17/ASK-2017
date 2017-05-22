package Interfaces.Bst;

import BST.Node;
import Interfaces.ITree;

/**
 * Created by pmazurek on 13.05.2017.
 */
public interface IBst <T extends Comparable<T>> extends ITree<T>{

     String toStringInOrder();

     String toStringPreOrder();

     String toStringPostOrder();

     int getBstHeight(Node<Integer> value);

}

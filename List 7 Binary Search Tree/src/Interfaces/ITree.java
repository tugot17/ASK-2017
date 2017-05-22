package Interfaces;

import BST.Node;
import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Created by pmazurek on 5/22/2017.
 */
public interface ITree <T extends Comparable<T>> {

    void insert(T element);

    Node<T> delete(T element);

    Node <T> minimum();

    Node<T> maximum();

    Node<T> search(T element);

    Node<T> successor();

    Node<T> predecessor();

    Node<T> getRoot();

}

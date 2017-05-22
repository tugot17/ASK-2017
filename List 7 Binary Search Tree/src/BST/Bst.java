package BST;

import Exceptions.DuplicateItemException;
import Exceptions.NoSuchElementException;
import Interfaces.Bst.IBst;
import Interfaces.ITree;

import java.util.Comparator;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class Bst <T extends Comparable<T> > implements IBst<T>{

    //<editor-fold desc="Elements">
    Node <T>  root;

    Comparator <T> comparator = new GenericComparator<>();
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Bst(Node<T> root) {
        this.root = root;
    }

    public Bst() {
        this.root = null;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">

    //<editor-fold desc="To String">
    @Override
    public String toStringInOrder() {
        return toStringInOrder(getRoot());
    }

    @Override
    public String toStringPreOrder() {
        return toStringPreOrder(root);
    }

    private String toStringPreOrder(Node<T> node) {
        String result = "";

        result += node + " ";

        if (node.left != null)
            result += toStringPreOrder(node.left);

        if (node.right != null)
            result += toStringPreOrder(node.right);

        return result;
    }

    @Override
    public String toStringPostOrder() {
        return null;
    }
    //</editor-fold>

    @Override
    public void insert(T value) {
        root = insert(value, root);
    }

    @Override
    public Node<T> delete(T element) {
        return null;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }

    //<editor-fold desc="Find Elements">
    @Override
    public Node<T> minimum() {
        return minimum(getRoot());
    }

    @Override
    public Node<T> maximum() {

        return maximum(getRoot());
    }



    @Override
    public Node<T> search(T element) {
        return search(element, getRoot());
    }

    @Override
    public Node<T> successor() {
        return null;
    }

    @Override
    public Node<T> predecessor() {
        return null;
    }

    //</editor-fold>


    @Override
    public int getBstHeight(Node<Integer> node) {

        if (node == null) {
            return -1;
        }

        int leftH = getBstHeight(node.left);
        int rightH = getBstHeight(node.right);

        if (leftH > rightH) {
            return leftH + 1;
        }
        else {
            return rightH + 1;
        }
    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private Node insert(T x, Node <T> t) {
        if (t== null) t = new Node(x);
        else {
            int compare = comparator.compare(x, t.value);

            if(compare < 0)
                t.left = insert(x, t.left);

            else if(compare > 0)
                t.right=insert(x, t.right);

            else
                throw new DuplicateItemException(x.toString());
        }
        return t;
    }

    private Node<T> search(T x, Node<T>  node) {

        if (node == null)
            throw new NoSuchElementException(x.toString());

        if (node.value.compareTo(x) == 0)
            return node;

        if (node.value.compareTo(x) > 0)
            return search(x, node.left);

        else
            return search(x, node.right);

    }

    private Node<T> maximum(Node<T> node) {

        if (node.right != null)
            return maximum(node.right);
        else
            return node;
    }

    private Node<T> minimum(Node<T> node) {

        if (node.left != null)
            return minimum(node.left);

        else
            return node;
    }

    private String toStringInOrder(Node<T> node) {

        String result = "";

        if (node.left != null)
            result += toStringInOrder(node.left);

        result += node.value.toString() + " ";

        if (node.right != null)
            result += toStringInOrder(node.right);

        return result;
    }

    //</editor-fold>




}

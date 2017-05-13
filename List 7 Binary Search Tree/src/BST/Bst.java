package BST;

import Exceptions.DuplicateItemException;

import java.util.Comparator;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class Bst <T extends Comparable<T> > implements IBst <T>{

    //<editor-fold desc="Elements">
    Node <T>  root;

    Comparator <T> comparator = new GenericComparator<>();
    //</editor-fold>

    public Bst(Node<T> root) {
        this.root = root;
    }

    public Bst() {

    }


    //<editor-fold desc="Public Methods">

    //<editor-fold desc="To String">
    @Override
    public String toStringInOrder() {
        return null;
    }

    @Override
    public String toStringPreOrder() {
        return null;
    }

    @Override
    public String toStringPostOrder() {
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Find Elements">
    @Override
    public Node<T> findBiggestElement() {
        return null;
    }

    @Override
    public Node<T> findSmallestElement() {
        return null;
    }
    //</editor-fold>

    @Override
    public void insertElement(T value) {
        root = insert(value, root);
    }

    @Override
    public T removeElement() {
        return null;
    }

    @Override
    public int getBstHeight(Node<Integer> value) {
        return 0;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }
    //</editor-fold>

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


}

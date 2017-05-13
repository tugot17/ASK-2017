package BST;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class Node <T extends Comparable<T> > implements Comparable<T>{

    //<editor-fold desc="Elements">
     T value;

    Node left;
    Node right;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(T value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(T o) {
        return value.compareTo(o);
    }
    //</editor-fold>

}

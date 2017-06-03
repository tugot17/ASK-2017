package BST;

import Exceptions.CanNotMergeTreesException;
import Exceptions.DuplicateItemException;
import Exceptions.NoSuccessorException;
import Exceptions.NoSuchElementException;
import Interfaces.Bst.IBst;
import Interfaces.ITree;
import com.sun.javaws.exceptions.CacheAccessException;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class Bst <T extends Comparable<T> > implements IBst<T>{

    //<editor-fold desc="Elements">
    private Node <T>  root;

    private Comparator <T> comparator = new GenericComparator<>();
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Bst(Node<T> root) {
        this.root = root;
    }

    public Bst() {
        this.root = null;
    }

    public Bst(IBst<T> leftSubTree, IBst<T> rightSubTree) {

        if (leftSubTree.maximum().value.compareTo(rightSubTree.getRoot().value) >= 0)
            throw new CanNotMergeTreesException();
        else {

            this.root = leftSubTree.maximum();

            root.left = leftSubTree.getRoot();

            root.right = rightSubTree.getRoot();

        }



    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">

    @Override
    public String toStringInOrder() {
        return toStringInOrder(getRoot());
    }

    @Override
    public String toStringPreOrder() {
        return toStringPreOrder(root);
    }

    @Override
    public String toStringPostOrder() {
        return toStringPostOrder(root);
    }

    @Override
    public void insert(T value) {
        root = insert(value, root);
    }

    @Override
    public void delete(T element) {
         delete(element, root);
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }

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
    public Node<T> successor(T element) {

        Node node = search(element);

        return successor(node);
    }

    @Override
    public Node<T> predecessor(T element) {
        return null;
    }

    @Override
    public int getBstHeight(Node<T> node) {

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

    @Override
    public void show()
    {
        Stack<Node> treeStack = new Stack<>();
        treeStack.push(root);
        int numOfBlanks = (int) Math.pow(2, getBstHeight(root) + 1);
        boolean isRowEmpty = false;
        System.out.println("\n");

        while (isRowEmpty == false) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int x = 0; x < numOfBlanks; x++)
                System.out.print(" ");

            while (treeStack.isEmpty() == false) {
                Node temp = treeStack.pop();
                if (temp != null)
                {
                    System.out.print(temp.value);
                    localStack.push(temp.left);
                    localStack.push(temp.right);

                    if (temp.left != null || temp.right != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int y = 0; y < numOfBlanks*2-2; y++)
                    System.out.print(" ");
            }

            System.out.println();
            numOfBlanks /= 2;

            while (localStack.isEmpty() == false)
                treeStack.push(localStack.pop());

        }
        System.out.println();
    }

    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private Node insert(T x, Node <T> t) {
        if (t== null)
            t = new Node(x);
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

    private String toStringPreOrder(Node<T> node) {
        String result = "";

        result += node.value.toString() + " ";

        if (node.left != null)
            result += toStringPreOrder(node.left);

        if (node.right != null)
            result += toStringPreOrder(node.right);

        return result;
    }

    private String toStringPostOrder(Node<T> node) {
        String result = "";

        if (node.left != null)
            result += toStringPostOrder(node.left);

        if (node.right != null)
            result += toStringPostOrder(node.right);

        result += node.value + " ";


        return result;

    }


    private Node delete(T element, Node<T> node) {

        if (node == null)
            throw new NoSuchElementException(element.toString());

        int compareResult = element.compareTo(node.value);

        if (compareResult < 0)
            node.left = delete(element, node.left);

        else if (compareResult > 0)
            node.right = delete(element, node.right);

        else if (node.left != null && node.right != null)
            node.right = detachMin(node.right, node);

        else
            node = (node.left != null) ? node.left : node.right;

        return node;
    }

    private Node detachMin(Node t, Node del) {
        if (t.left!=null)
            t.left=detachMin(t.left, del);

        else
            {del.value=t.value; t=t.right;}

        return t;
    }

    private Node successor(Node<T> node) {

        if (node.right != null)
            return minimum(node.right);

        else
            return findSuccessorFromParent(node.value, root);
    }

    private Node findSuccessorFromParent(T element, Node<T> node) {

        int compareResult = element.compareTo(node.value);

        if (node == null || compareResult == 0)
            throw new NoSuccessorException(element.toString());


        if (compareResult > 0) {
                return findSuccessorFromParent(element, node.right);
        }

        else {

            if (node.left.value.compareTo(element) == 0)
                return node;

            else
                return findSuccessorFromParent(element, node.left);
        }

    }
    //</editor-fold>




}

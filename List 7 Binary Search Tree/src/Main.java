import BST.Bst;
import Interfaces.Bst.IBst;
import BST.Node;

public class Main {

    public static void main(String[] args) {

        IBst <Integer> bst = new Bst<>();

        bst.insert(22);
        bst.insert(12);
        bst.insert(2);
        bst.insert(221);
        bst.insert(32);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);




        bst.show();

        bst.delete(22);
        bst.delete(3);

        bst.show();



    }
}

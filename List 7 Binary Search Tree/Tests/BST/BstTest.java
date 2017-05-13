package BST;

import Exceptions.DuplicateItemException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class BstTest {

    IBst <Integer> bst;

    @Before
    public void setUp() throws Exception {
        bst = new Bst<>();

        bst.insertElement(22);
        bst.insertElement(12);
        bst.insertElement(2);
        bst.insertElement(221);
        bst.insertElement(32);
        bst.insertElement(1);
        bst.insertElement(3);
        bst.insertElement(4);


    }

    @Test
    public void toStringInOrder() throws Exception {

    }

    @Test
    public void toStringPreOrder() throws Exception {

    }

    @Test
    public void toStringPostOrder() throws Exception {

    }

    @Test
    public void findBiggestElement() throws Exception {
        Assert.assertEquals(java.util.Optional.of(221), bst.findBiggestElement().value);

    }

    @Test
    public void findSmallestElement() throws Exception {
        Assert.assertEquals(java.util.Optional.of(1), bst.findBiggestElement().value);
    }

    @Test
    public void getBstHeight() throws Exception {
        Assert.assertEquals(9, bst.getBstHeight(bst.getRoot()));
    }


    @Test
    public void insertElement() throws Exception {
        Assert.assertEquals(java.util.Optional.of(22), bst.getRoot().value);
    }

    @Test (expected = DuplicateItemException.class)
    public void duplicateException() throws Exception {
        bst.insertElement(22);
    }
}
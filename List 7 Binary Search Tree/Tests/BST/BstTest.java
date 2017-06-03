package BST;

import Exceptions.DuplicateItemException;
import Exceptions.NoSuccessorException;
import Exceptions.NoSuchElementException;
import Interfaces.Bst.IBst;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class BstTest {

    Bst<Integer> bst;

    @Before
    public void setUp() throws Exception {
        bst = new Bst<>();

        bst.insert(22);
        bst.insert(12);
        bst.insert(2);
        bst.insert(221);
        bst.insert(32);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
    }

    @Test
    public void toStringInOrder() throws Exception {
        Assert.assertEquals("1 2 3 4 12 22 32 221 ", bst.toStringInOrder());
    }

    @Test
    public void toStringPreOrder() throws Exception {
        Assert.assertEquals("22 12 2 1 3 4 221 32 ", bst.toStringPreOrder());
    }

    @Test
    public void toStringPostOrder() throws Exception {
        Assert.assertEquals("1 4 3 2 12 32 221 22 ", bst.toStringPostOrder());
    }

    @Test
    public void search() throws Exception {
        Assert.assertEquals(22,(long) bst.search(22).value);
    }

    @Test
    public void search2() throws Exception {
        Assert.assertEquals(221,(long) bst.search(221).value);
    }

    @Test
    public void maximum() throws Exception {
        Assert.assertEquals(221, (long)bst.maximum().value);

    }

    @Test
    public void minimum() throws Exception {
        Assert.assertEquals(1, (long)bst.minimum().value);
    }

    @Test
    public void getBstHeight() throws Exception {
        Assert.assertEquals(4, bst.getBstHeight(bst.getRoot()));
    }

    @Test
    public void delete() throws Exception {
        bst.delete(22);
        Assert.assertEquals(32, (long)bst.getRoot().value);
    }

    @Test
    public void successor() throws Exception {
        Assert.assertEquals(32, (long)bst.successor(22).value);
    }

    @Test
    public void successor2() throws Exception {
        Assert.assertEquals(22, (long)bst.successor(12).value);
    }

    @Test
    public void successor3() throws Exception {
        Assert.assertEquals(2, (long)bst.successor(1).value);
    }

    @Test
    public void successor4() throws Exception {
        Assert.assertEquals(3, (long)bst.successor(2).value);
    }

    @Test
    public void successor5() throws Exception {
        Assert.assertEquals(12, (long)bst.successor(4).value);
    }

    @Test (expected = NoSuccessorException.class)
    public void successor6() throws Exception {
        bst.successor(221);
    }



    @Test (expected = DuplicateItemException.class)
    public void duplicateException() throws Exception {
        bst.insert(22);
    }

    @Test (expected = NoSuchElementException.class)
    public void noSuchElementException() throws Exception {
        bst.search(-19);
    }


}
package Dictionaries;

import Interfaces.Dictionaries.IDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class OpenAddressingDictionaryTest {
    IDictionary<Integer> dictionary;

    @Before
    public void setUp() throws Exception {
        dictionary = new OpenAddressingDictionary<>(100);

        dictionary.insert(19);
        dictionary.insert(43);
        dictionary.insert(21);
    }

    @Test
    public void insert() throws Exception {
        dictionary.insert(12);

        Assert.assertEquals(12, (long)dictionary.search(12) );
    }

    @Test
    public void delete() throws Exception {
        dictionary.delete(19);

        Assert.assertEquals(null, dictionary.search(19));
    }

    @Test
    public void search() throws Exception {

        Assert.assertEquals(null, dictionary.search(119));
    }

    @Test
    public void search2() throws Exception {

        Assert.assertEquals(21, (long)dictionary.search(21));
    }

    @Test
    public void search3() throws Exception {
        dictionary.insert(119);

        Assert.assertEquals(119, (long)dictionary.search(119));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void indexArrayOutOfBoundException() throws Exception {
        dictionary.insert(121);
    }
}
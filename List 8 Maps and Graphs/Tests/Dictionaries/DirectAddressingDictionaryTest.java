package Dictionaries;

import Interfaces.Dictionaries.IDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class DirectAddressingDictionaryTest {

    IDictionary <Integer> dictionary;

    @Before
    public void setUp() throws Exception {
        dictionary = new DirectAddressingDictionary<>(100);

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

        Assert.assertEquals(21, (long)dictionary.search(21));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void indexArrayOutOfBoundException() throws Exception {
        dictionary.insert(121);
    }
}
package Dictionaries;

import Interfaces.Dictionaries.IDictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class ListHashAddressingDictionaryTest {

    IDictionary<Integer> dictionary;

    @Before
    public void setUp() throws Exception {
        dictionary = new ListHashAddressingDictionary<>(100);

        dictionary.insert(222);
        dictionary.insert(21);
        dictionary.insert(2);
        dictionary.insert(19);
    }

    @Test
    public void insert() throws Exception {
        dictionary.insert(119);
        dictionary.insert(219);

        Assert.assertEquals(19, (long)dictionary.search(19));

    }

    @Test
    public void delete() throws Exception {
        dictionary.delete(19);

        Assert.assertEquals(null, dictionary.search(19));
    }

    @Test
    public void delete2() throws Exception {
        dictionary.delete(1222);

        Assert.assertEquals(null, dictionary.search(1222));
    }

    @Test
    public void search() throws Exception {
        Assert.assertEquals(21, (long)dictionary.search(21));

    }

    @Test
    public void nullSearch() throws Exception {
        Assert.assertEquals(null, dictionary.search(2228));
    }
}
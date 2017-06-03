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

    DictionaryTestingHelper helper;


    @Before
    public void setUp() throws Exception {
        dictionary = new DirectAddressingDictionary<>(100);

        dictionary.insert(19);
        dictionary.insert(43);
        dictionary.insert(21);

        helper  = new DictionaryTestingHelper(dictionary);
    }

    @Test
    public void insert() throws Exception {
        helper.insert();
    }

    @Test
    public void delete() throws Exception {
        helper.delete();
    }

    @Test
    public void search2() throws Exception {
        helper.search2();
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void indexArrayOutOfBoundException() throws Exception {
        dictionary.insert(121);
    }
}
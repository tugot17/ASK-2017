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

    DictionaryTestingHelper helper;
    @Before
    public void setUp() throws Exception {
        dictionary = new ListHashAddressingDictionary<>(100);

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
    public void delete2() throws Exception {
        helper.delete2();
    }

    @Test
    public void search() throws Exception {

        helper.search();
    }

    @Test
    public void search2() throws Exception {
        helper.search2();
    }

    @Test
    public void search3() throws Exception {
        helper.search3();
    }

    @Test
    public void nullSearch() throws Exception {
        helper.nullSearch();
    }
}
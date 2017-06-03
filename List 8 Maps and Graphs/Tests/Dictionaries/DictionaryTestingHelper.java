package Dictionaries;

import Interfaces.Dictionaries.IDictionary;
import org.junit.Assert;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class DictionaryTestingHelper {

    static IDictionary dictionary;

    public DictionaryTestingHelper(IDictionary dictionary) {
        this.dictionary = dictionary;

        this.dictionary.insert(19);
        this.dictionary.insert(43);
        this.dictionary.insert(21);
        this.dictionary.insert(12);
        this.dictionary.insert(29);


    }

    public  void insert() {
        Assert.assertEquals(12, (int)dictionary.search(12) );
    }

    public void delete() {
        dictionary.delete(29);

        Assert.assertEquals(null, dictionary.search(29));
    }

    public void search() {

        Assert.assertEquals(null, dictionary.search(119));
    }

    public void search2()  {

        Assert.assertEquals(21, (int)dictionary.search(21));
    }

    public void search3()  {
        dictionary.insert(119);

        Assert.assertEquals(119, (int)dictionary.search(119));
    }

    public void delete2() throws Exception {
        this.dictionary.insert(1222);

        dictionary.delete(1222);

        Assert.assertEquals(null, dictionary.search(1222));
    }

    public void nullSearch() throws Exception {
        Assert.assertEquals(null, dictionary.search(2228));
    }
}

package Dictionaries;

import Interfaces.Dictionaries.IDictionary;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class DirectAddressingDictionary<T> implements IDictionary <T>{

    int dictionarySize;

    T [] records;

    public DirectAddressingDictionary(int dictionarySize) {
        this.dictionarySize = dictionarySize;

        this.records =  (T[]) new Object [dictionarySize];   // it doesn't look good try to repair it #todo
    }

    @Override
    public void insert(T element) {

        records [ indexOf(element) ] = element;
    }

    @Override
    public void delete(T element) {
        records [ indexOf(element) ] = null;
    }

    @Override
    public T search(T element) {
        return records[ indexOf(element) ];
    }

    private int indexOf(T element) {
        return element.hashCode();
    }
}

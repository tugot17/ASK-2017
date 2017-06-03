package Dictionaries;

import Interfaces.Dictionaries.IDictionary;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class HashAddressingDictionary <T> implements IDictionary <T>{

    int dictionarySize;

    T [] records;

    public HashAddressingDictionary(int dictionarySize) {
        this.dictionarySize = dictionarySize;

        this.records =  (T[]) new Object [dictionarySize];   // it doesn't look good try to repair it #todo
    }
    
        @Override
    public void insert(T element) {

    }

    @Override
    public void delete(T element) {

    }

    @Override
    public T search(T element) {
        return null;
    }
}

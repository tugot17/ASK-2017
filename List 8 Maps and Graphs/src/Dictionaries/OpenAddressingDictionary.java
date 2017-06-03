package Dictionaries;

import Exceptions.NoFreeSpaceException;
import Exceptions.NoSuchElementException;
import Interfaces.Dictionaries.IDictionary;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class OpenAddressingDictionary<T> implements IDictionary <T>{

    int dictionarySize;

    T [] records;

    public OpenAddressingDictionary(int dictionarySize) {
        this.dictionarySize = dictionarySize;

        this.records =  (T[]) new Object [dictionarySize];   // it doesn't look good try to repair it #todo
    }

    @Override
    public void insert(T element) {

        int id = indexOf(element);

        if ( records[id] == null)
            records[id] = element;

        else
            records[ findFirstFreePosition( id ) ] = element;
    }

    @Override
    public void delete(T element) {

        int id = indexOf(element);

        int i = 0;

        if (records[id].equals(element) )
            records[id] = null;
        else {
            while (i < dictionarySize){

                if (records[id % dictionarySize] == null)
                    throw new NoSuchElementException(element);

                else if (records[id % dictionarySize].equals(element))
                     records[id % dictionarySize] = null;

                i++;
                id++;
            }
        }

    }

    @Override
    public T search(T element) {

        int id = indexOf(element);

        int i = 0;

        if (records[id] == null)
            return null;

        if (records[id].equals(element) )
            return element;

        else {
            while (i < dictionarySize){

                if (records[id % dictionarySize] == null)
                    return null;
                else if (records[id % dictionarySize].equals(element))
                    return records[id % dictionarySize];

                i++;
                id++;
            }
        }


        return null;
    }

    private int indexOf(T element) {

        return element.hashCode() % dictionarySize ;
    }

    private int findFirstFreePosition(int id) {

        int i = 0;

        while (i < dictionarySize) {
            if (records [id % dictionarySize] == null)
                return id % dictionarySize;

            i++;
            id++;
        }

        throw new NoFreeSpaceException();
    }

}

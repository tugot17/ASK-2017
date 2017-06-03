package Dictionaries;

import Interfaces.Dictionaries.IDictionary;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class ListHashAddressingDictionary<T> implements IDictionary <T>{

    int dictionarySize;
    LinkedList<T>[] records;

    public ListHashAddressingDictionary(int dictionarySize) {
        this.dictionarySize = dictionarySize;

        this.records = new LinkedList [dictionarySize];   // ait doesn't look good try to repair it #todo
    }

        @Override
    public void insert(T element) {

        int id = indexOf(element);

        if (records[id] == null) {
            records[id] = new LinkedList<>();

            records[id].add(element);
        }

        else
            records[indexOf(element)].add(element);
        }

    @Override
    public void delete(T element) {
        records[indexOf(element)].remove(element);
    }

    @Override
    public T search(T element) {

        int id = indexOf(element);

        if (records[id] == null)
            return null;

        for (int i = 0; i < records[id].size(); i++) {
            if (records[id].get(i).equals(element))
                return records[id].get(i);
        }

        return null;

    }

    private int indexOf(T element) {

        return element.hashCode() % dictionarySize ;
    }
}

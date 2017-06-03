package Interfaces.Dictionaries;

/**
 * Created by pmazurek on 6/3/2017.
 */
public interface IDictionary <T> {

    void insert(T element);

    void delete (T element);

    T search (T element);
}

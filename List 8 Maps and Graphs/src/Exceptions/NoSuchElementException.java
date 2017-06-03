package Exceptions;

/**
 * Created by pmazurek on 6/3/2017.
 */
public class NoSuchElementException extends RuntimeException {

    public NoSuchElementException(Object obj) {
        super(obj.toString());
    }
}

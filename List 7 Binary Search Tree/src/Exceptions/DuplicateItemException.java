package Exceptions;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class DuplicateItemException extends RuntimeException {
    public DuplicateItemException(String message) { super(message); }
}

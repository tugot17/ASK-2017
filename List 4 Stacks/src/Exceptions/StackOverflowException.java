package Exceptions;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class StackOverflowException extends RuntimeException {
    public StackOverflowException()
    {
        Message.showException("Stack Overflow");
    }
}

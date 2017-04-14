package Exceptions;

import Messages.Message;

/**
 * Created by pmazurek on 08.04.2017.
 */
public class UndefinedOperatorException extends RuntimeException {
    public UndefinedOperatorException()
    {
        Message.showException("Undefined Math Operator");
    }
}

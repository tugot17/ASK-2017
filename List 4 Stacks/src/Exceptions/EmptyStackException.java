package Exceptions;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class EmptyStackException  extends RuntimeException{
    public EmptyStackException()
    {
        Message.showException("Empty Stack");
    }

}

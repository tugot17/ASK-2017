package Stack;


import Exceptions.EmptyStackException;

/**
 * Created by pmazurek on 07.04.2017.
 */
public interface Stack{

    public void push(Object value); //put on Stack
    public Object pop()  throws EmptyStackException; //get from Stack
    public Object peek() throws EmptyStackException; //read from Stack

    public void clear();
    public int size();
    public boolean isEmpty();

}

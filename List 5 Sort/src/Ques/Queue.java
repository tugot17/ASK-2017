package Ques;

/**
 * Created by pmazurek on 02.04.2017.
 */
public interface Queue {

    public void enqueue(Object value);

    public Object dequeue(); //throws EmptyQueueException;

    public void clear();

    public int size();

    public boolean isEmpty();

}
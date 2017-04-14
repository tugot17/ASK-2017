package Task2;

import Exceptions.EmptyStackException;
import List.Iterator;
import List.LinkedList;
import Stack.Stack;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class ListStack implements Stack{

    //<editor-fold desc="Elements">
    private LinkedList stack;
    private Iterator iterator;
    private int stackSize;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public ListStack()
    {
        this.stack= new LinkedList();
        this.iterator= stack.iterator();
        this.stackSize=0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void push(Object value)
    {
        stack.add(value);
        stackSize++;
    }

    @Override
    public Object pop() throws EmptyStackException
    {
        if (isEmpty())
            throw new EmptyStackException();

        stackSize--;

        return stack.delete(stackSize);
    }

    @Override
    public Object peek() throws EmptyStackException
    {
        Object result= pop();

        push(result);

        return result;
    }

    @Override
    public void clear()
    {
        int amountOfClearesd=stackSize;

        for (int i=0; i<amountOfClearesd; i++)
        {
            stack.delete(0);
        }

        stackSize=0;
    }

    @Override
    public int size() {
        return stackSize;
    }

    @Override
    public boolean isEmpty() {
        return stackSize==0;
    }
    //</editor-fold>
}

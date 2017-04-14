package Task1;

import Exceptions.EmptyStackException;
import Exceptions.StackOverflowException;
import Stack.Stack;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class ArrayStack implements Stack {

    //<editor-fold desc="Elements">
    int maxStackSize;

    int stackSize;

    Object stack[];
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public ArrayStack(int maxArraySize)
    {
        this.maxStackSize = maxArraySize;
        this.stack =new Object[maxArraySize];
        clear();

    }

    public ArrayStack()
    {
        this.maxStackSize =16;
        stack = new Object[maxStackSize];
        clear();
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void push(Object value) throws StackOverflowException
    {
        if (stackSize == maxStackSize)
        {
            throw new StackOverflowException();
        }
        stack[stackSize]=value;
        stackSize++;
    }

    @Override
    public Object pop() throws EmptyStackException
    {
        if (stackSize ==0)
            throw new EmptyStackException();

        stackSize--;

        return stack[stackSize];
    }

    @Override
    public Object peek()
    {
        if (stackSize ==0)
            throw new EmptyStackException();

        return  stack[stackSize -1];
    }

    @Override
    public void clear()
    {
        stackSize= 0;
    }

    @Override
    public int size()
    {
        return stackSize;
    }

    @Override
    public boolean isEmpty()
    {
        return stackSize==0;
    }
    //</editor-fold>

}

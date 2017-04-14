package Task4;

import Exceptions.EmptyStackException;
import Stack.Stack;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class DynamicStack implements Stack {

    //<editor-fold desc="Elements">
    int defaultStackSize;

    int stackSize;

    Object stack[];
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public DynamicStack(int defaultStackSize)
    {
        this.defaultStackSize = defaultStackSize;
        this.stack =new Object[defaultStackSize];
        clear();

    }

    public DynamicStack()
    {
        this.defaultStackSize =16;
        stack = new Object[defaultStackSize];
        clear();
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void push(Object value)
    {

        if(biggerThenDefaultSizeThreeFourth())
            increaseStackSize();

        stack[stackSize]=value;
        stackSize++;

    }

    @Override
    public Object pop() throws EmptyStackException
    {
        if (stackSize ==0)
            throw new EmptyStackException();

        if(smalerThenDefaultSizeFourth())
            reduceStackSize();

        if (stackSize ==0)
            throw new EmptyStackException();

        stackSize--;

        return stack[stackSize];
    }

    @Override
    public Object peek() throws EmptyStackException
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

    public int defaultSize()
    {
        return defaultStackSize;
    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private boolean needToChangeStackSize()
    {
        return smalerThenDefaultSizeFourth() || biggerThenDefaultSizeThreeFourth();
    }

    private boolean smalerThenDefaultSizeFourth()
    {

        return (stackSize-1)<=(double)defaultStackSize/4;
    }

    private boolean biggerThenDefaultSizeThreeFourth()
    {
        return (stackSize+1)>=(double)defaultStackSize*0.75;
    }

    private void reduceStackSize()
    {
        Object helperStack= new Object[stackSize];
        System.arraycopy(stack, 0, helperStack, 0, stackSize);

        if(defaultStackSize%2==1)
            defaultStackSize++;

        defaultStackSize/=2;

        stack= new Object[defaultStackSize];
        System.arraycopy(helperStack, 0, stack, 0, stackSize);

    }

    private void increaseStackSize()
    {
        Object helperStack= new Object[stackSize];
        System.arraycopy(stack, 0, helperStack, 0, stackSize);

        defaultStackSize*=2;

        stack= new Object[defaultStackSize];
        System.arraycopy(helperStack, 0, stack, 0, stackSize);
    }
    //</editor-fold>
}

package Task4;

import Exceptions.EmptyStackException;
import Stack.Stack;
import Task3.SinkingStack;
import Task4.DynamicStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 14.04.2017.
 */
public class DynamicStackTest {

    DynamicStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new DynamicStack(4);
        stack.push(1);
        stack.push(2);
    }

    @Test
    public void push() throws Exception {
        stack.push(3);
        assertEquals(8, stack.defaultSize());

    }

    @Test (expected = EmptyStackException.class)
    public void popException() throws Exception {
        stack= new DynamicStack();
        stack.pop();
    }

    @Test
    public void pop() throws Exception {
        assertEquals(2, stack.pop());
    }

    @Test (expected = EmptyStackException.class)
    public void peekException() throws Exception {
        stack= new DynamicStack();
        stack.peek();
    }

    @Test
    public void peek() throws Exception {
        assertEquals(2, stack.pop());
    }

    @Test
    public void clear() throws Exception {
        stack.clear();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void size() throws Exception {
        assertEquals(2, stack.size());
    }

    @Test
    public void isEmpty() throws Exception {
        assertFalse(stack.isEmpty());
    }

    @Test
    public void defaultSizeDecrease() throws Exception {
        stack.pop();
        assertEquals(2,stack.defaultSize());
    }

}
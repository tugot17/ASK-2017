package Task3;

import Exceptions.EmptyStackException;
import Task2.ListStack;
import Task3.SinkingStack;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 14.04.2017.
 */
public class SinkingStackTest {

    SinkingStack stack;

    @Rule
    public Timeout globalTimeOut = Timeout.seconds(5);

    @Before
    public void setUp() throws Exception {
        stack  = new SinkingStack(5);
        stack.push(1);
        stack.push(2);

    }

    @Test
    public void push() throws Exception {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(5, stack.size());

    }

    @Test (expected = EmptyStackException.class)
    public void popException() throws Exception {
        stack= new SinkingStack();
        stack.pop();
    }

    @Test
    public void pop() throws Exception {
        assertEquals(2, stack.pop());
    }

    @Test (expected = EmptyStackException.class)
    public void peekException() throws Exception {
        stack= new SinkingStack();
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


}
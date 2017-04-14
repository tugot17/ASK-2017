package Task2;

import Exceptions.EmptyStackException;
import Task2.ListStack;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 14.04.2017.
 */
public class ListStackTest {

    private ListStack stack;
    @Rule
    public Timeout globalTimeOut = Timeout.seconds(5);

    @Before
    public void setUp() throws Exception {
        stack= new ListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

    }

    @Test
    public void push() throws Exception {
        stack.push(33);
        assertEquals(5, stack.size());
    }

    @Test (expected = EmptyStackException.class)
    public void popException() throws Exception {
        stack= new ListStack();
        stack.pop();
    }

    @Test
    public void pop() throws Exception {
        assertEquals(4, stack.pop());

    }

    @Test (expected = EmptyStackException.class)
    public void peekException() throws Exception {
        stack= new ListStack();
        stack.peek();
    }

    @Test
    public void peek() throws Exception {
        assertEquals(4, stack.pop());

    }

    @Test
    public void clear() throws Exception {
        stack.clear();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void size() throws Exception {
        assertEquals(4, stack.size());

    }

    @Test
    public void isEmpty() throws Exception {
        assertFalse(stack.isEmpty());

    }

}
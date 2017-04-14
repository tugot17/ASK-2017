package Task1;

import Task1.ArrayStack;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 14.04.2017.
 */
public class ArrayStackTest {

    private ArrayStack stack= new ArrayStack(10);

    @Test
    public void push() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }



    @Test
    public void pop() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());

    }

    @Test
    public void peek() throws Exception {
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void size() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());

    }

    @Test
    public void isEmptyFalse() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmptyTrue() throws Exception {
        assertTrue(stack.isEmpty());
    }

}
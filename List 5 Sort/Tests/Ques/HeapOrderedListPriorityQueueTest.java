package Ques;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by pmazurek on 12.05.2017.
 */
public class HeapOrderedListPriorityQueueTest {

    Queue queue;

    Comparator comparator;

    @Before
    public void setUp() throws Exception {
        comparator = new IntegerComparator();

        queue = new HeapOrderedListPriorityQueue(comparator);

        queue.enqueue(2);
        queue.enqueue(33);
        queue.enqueue(221);
        queue.enqueue(3);
        queue.enqueue(1);

    }

    @Test
    public void clear() throws Exception {
        queue.clear();
        assertEquals(0, queue.size());
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(5, queue.size());
    }

    @Test
    public void testSort1() throws Exception {
        Assert.assertEquals(221, queue.dequeue());
    }

    @Test
    public void testSort2() throws Exception {
        queue.dequeue();
        Assert.assertEquals(33, queue.dequeue());
    }

    @Test
    public void testSort3() throws Exception {
        queue.dequeue();
        queue.dequeue();
        Assert.assertEquals(3, queue.dequeue());
    }

    @Test
    public void testSort4() throws Exception {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        Assert.assertEquals(2, queue.dequeue());
    }
}
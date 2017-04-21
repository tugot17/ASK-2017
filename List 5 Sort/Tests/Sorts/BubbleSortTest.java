package Sorts;

import Sorts.BubbleSort.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class BubbleSortTest {
    ISort sort;

    @Before
    public void setUp() throws Exception {
        sort = new BubbleSort(0);
    }

    @Test
    public void sort1() throws Exception {
        CompereSortTest.testSingleSort1(sort);

    }

    @Test
    public void sort2() throws Exception {
        CompereSortTest.testSingleSort2(sort);

    }

    @Test
    public void sort3() throws Exception {
        CompereSortTest.testSingleSort3(sort);

    }



}
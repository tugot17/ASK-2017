package Sorts;

import Sorts.BubbleSort.ShakerSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 23.04.2017.
 */
public class ShakerSortTest {
    ISort sort;


    @Before
    public void setUp() throws Exception {
        sort = new ShakerSort(0);

    }

    @Test
    public void sort1() throws Exception {
        SortTestingHelper.testSingleSort1(sort);

    }

    @Test
    public void sort2() throws Exception {
        SortTestingHelper.testSingleSort2(sort);

    }

    @Test
    public void sort3() throws Exception {
        SortTestingHelper.testSingleSort3(sort);

    }
}
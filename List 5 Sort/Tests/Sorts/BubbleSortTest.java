package Sorts;

import Sorts.SimpleSorts.BubbleSort.BubbleSort;
import Sorts.SimpleSorts.SelectSort.SelectSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 07.05.2017.
 */
public class BubbleSortTest {
    ISort sort;


    @Before
    public void setUp() throws Exception {
        sort = new BubbleSort();
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

    @Test
    public void sort4() throws Exception {
        SortTestingHelper.testDescendingSort(sort);
    }

    @Test
    public void sort5() throws Exception {
        SortTestingHelper.testAscendingSort(sort);
    }

}
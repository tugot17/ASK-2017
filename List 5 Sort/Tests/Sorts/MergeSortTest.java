package Sorts;

import Sorts.MergeSort.MergeSort;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 21.04.2017.
 */
public class MergeSortTest {
    ISort sort;

    @Before
    public void setUp() throws Exception {
        sort = new MergeSort(1);
    }

    @Ignore
    @Test
    public void sort1() throws Exception {
        SortTestingHelper.testSingleSort1(sort);

    }

    @Ignore
    @Test
    public void sort2() throws Exception {
        SortTestingHelper.testSingleSort2(sort);

    }
    @Ignore
    @Test
    public void sort3() throws Exception {
        SortTestingHelper.testSingleSort3(sort);

    }

}
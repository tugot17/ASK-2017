package Sorts;

import Sorts.SelectSort.SelectSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class InsertSortTest {


    ISort sort;


    @Before
    public void setUp() throws Exception {
        sort = new SelectSort(0);

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
package Sorts;

import Sorts.AdvancedSorts.QuickSort.QuickSort;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class QuickSortTest {

    private ISort sort;
    @Before
    public void setUp() throws Exception {

        sort = new QuickSort(0);
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

    @Ignore
    @Test
    public void sort4() throws Exception {
        SortTestingHelper.testDescendingSort(sort);
    }

    @Ignore
    @Test
    public void sort5() throws Exception {
        SortTestingHelper.testAscendingSort(sort);
    }

}
package Sorts;

import Sorts.QuickSort.QuickSort;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class QuickSortTest {

    ISort sort;
    @Before
    public void setUp() throws Exception {

        sort = new QuickSort();
    }


    @Ignore
    @Test
    public void sort() throws Exception {

        int arrray []= {12, 13, 1, 5, 69};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
    }

}
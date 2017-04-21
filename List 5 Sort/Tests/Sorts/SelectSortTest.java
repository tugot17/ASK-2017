package Sorts;

import Sorts.SelectSort.SelectSort;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class SelectSortTest {

    private ISort sort;

    @Before
    public void setUp() throws Exception {
        sort = new SelectSort(1);
    }

    @Ignore
    @Test
    public void sort() throws Exception {
        int arrray[] = {12, 13, 1, 69, 5};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
        assertEquals(12, arrray[2]);
        assertEquals(13, arrray[3]);
        assertEquals(69, arrray[4]);
    }

}
package Sorts;

import Sorts.InsertSort.InsertSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class InsertSortTest {


    ISort sort;


    @Before
    public void setUp() throws Exception {
        sort = new InsertSort(0);

    }

    @Test
    public void sort() throws Exception {
        int arrray[] = {12, 13, 1, 69, 5,};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
        assertEquals(12, arrray[2]);
        assertEquals(13, arrray[3]);
        assertEquals(69, arrray[4]);
    }
}
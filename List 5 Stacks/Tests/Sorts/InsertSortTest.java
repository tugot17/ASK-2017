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
        int arrray []= {12, 13, 1, 5, 69};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
    }
}
package Sorts;

import Sorts.BubbleSort.BubbleSort;
import Sorts.InsertSort.InsertSort;
import Sorts.SelectSort.SelectSort;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
/**
 * Created by pmazurek on 21.04.2017.
 */
public class CompereSortTest {

    ISort bubbleSort;
    ISort insertSort;
    ISort selectSort;

    @Before
    public void setUp() throws Exception {
        bubbleSort = new BubbleSort(1);
        insertSort = new InsertSort(1);
        selectSort = new SelectSort(1);

    }

    @Test
    public void testAllSorts() throws Exception {
        testSingleSort(bubbleSort);
        testSingleSort(insertSort);
        testSingleSort(selectSort);


    }

    private void testSingleSort(ISort sort) {
        int arrray[] = {12, 13, 1, 69, 5,};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
        assertEquals(12, arrray[2]);
        assertEquals(13, arrray[3]);
        assertEquals(69, arrray[4]);
    }

}

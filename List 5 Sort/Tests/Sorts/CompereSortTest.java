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


    public static void testSingleSort1(ISort sort) {
        int arrray[] = {12, 13, 1, 69, 5};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(5, arrray[1]);
        assertEquals(12, arrray[2]);
        assertEquals(13, arrray[3]);
        assertEquals(69, arrray[4]);
    }

    public static void testSingleSort2(ISort sort) {
        int arrray[] = {5, 4, 3, 2, 1};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(2, arrray[1]);
        assertEquals(3, arrray[2]);
        assertEquals(4, arrray[3]);
        assertEquals(5, arrray[4]);
    }

    public static void testSingleSort3(ISort sort) {
        int arrray[] = {5, 4, 4, 4, 1};

        int resultArray[] = sort.sort(arrray);

        assertEquals(1, arrray[0]);
        assertEquals(4, arrray[1]);
        assertEquals(4, arrray[2]);
        assertEquals(4, arrray[3]);
        assertEquals(5, arrray[4]);
    }





}

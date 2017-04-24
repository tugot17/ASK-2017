package Sorts;

import org.junit.Before;

import static org.junit.Assert.*;
/**
 * Created by pmazurek on 21.04.2017.
 */
public class SortTestingHelper {


    public static void testSingleSort1(ISort sort) {
        int array[] = {12, 13, 1, 69, 5};

        sort.sort(array);

        assertEquals(1, array[0]);
        assertEquals(5, array[1]);
        assertEquals(12, array[2]);
        assertEquals(13, array[3]);
        assertEquals(69, array[4]);
    }

    public static void testSingleSort2(ISort sort) {
        int array[] = {5, 4, 3, 2, 1};

        sort.sort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);
        assertEquals(5, array[4]);
    }

    public static void testSingleSort3(ISort sort) {
        int array[] = {5, 4, 4, 4, 1};

        sort.sort(array);

        assertEquals(1, array[0]);
        assertEquals(4, array[1]);
        assertEquals(4, array[2]);
        assertEquals(4, array[3]);
        assertEquals(5, array[4]);
    }





}

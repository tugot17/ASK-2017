package Helpers;

import Sorts.ISort;

/**
 * Created by pmazurek on 07.05.2017.
 */
public class SortsCompare {

    public static void comapare2Sorts(ISort s1, ISort s2) {

        Stopper time1;
        int amountOfComparations1;

        Stopper time2;
        int amountOfComparations2;

        int [] almostSortedArray1;
        int [] almostSortedArray2;



        System.out.println("Almost Sorted Array");
        almostSortedArray1 = IntegersGenerator.createAlmostSortedArray(50000);
        almostSortedArray2 = almostSortedArray1.clone();
        s1.sort(almostSortedArray1);
        s2.sort(almostSortedArray2);



        System.out.println("\nSorted Array");
        almostSortedArray1 = IntegersGenerator.createAscendingSortedArray(50000);
        almostSortedArray2 = almostSortedArray1.clone();
        s1.sort(almostSortedArray1);
        s2.sort(almostSortedArray2);


    }


}

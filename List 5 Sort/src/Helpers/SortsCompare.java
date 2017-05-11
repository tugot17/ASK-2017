package Helpers;

import Sorts.ISort;

/**
 * Created by pmazurek on 07.05.2017.
 */
public class SortsCompare {

    //<editor-fold desc="Elements">
    private static int amountOfElements = 10000;
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public static void comapare2Sorts(ISort s1, ISort s2) {

        compareSortOfAlmostSorted(s1, s2);

        compareSortOfSorted(s1, s2);

        compareSortOfNotSorted(s1,s2);

    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private static void compareSortOfNotSorted(ISort s1, ISort s2) {
        int [] notSortedArray1;
        int [] notSortedArray2;

        System.out.println("\nNot Sorted Arrays");
        notSortedArray1 = IntegersGenerator.createRandomArrayGenerator(amountOfElements);
        notSortedArray2 = notSortedArray1.clone();

        s1.sort(notSortedArray1);
        s2.sort(notSortedArray2);
    }

    private static void compareSortOfAlmostSorted (ISort s1, ISort s2) {
        int [] almostSortedArray1;
        int [] almostSortedArray2;

        System.out.println("Almost Sorted Arrays");
        almostSortedArray1 = IntegersGenerator.createAlmostSortedArray(amountOfElements);
        almostSortedArray2 = almostSortedArray1.clone();

        s1.sort(almostSortedArray1);
        s2.sort(almostSortedArray2);
    }

    private static void compareSortOfSorted(ISort s1, ISort s2) {
        int [] sortedArray1;
        int [] sortedArray2;

        System.out.println("\nSorted Array");
        sortedArray1 = IntegersGenerator.createAscendingSortedArray(amountOfElements);
        sortedArray2 = sortedArray1.clone();

        s1.sort(sortedArray1);
        s2.sort(sortedArray2);

    }
    //</editor-fold>


}

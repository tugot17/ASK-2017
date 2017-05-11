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
    public static void compareSorts(ISort... sorts) {
        for (int i = 0; i < sorts.length; i++) {
            compareSortOfSorted(sorts[i]);
        }

        System.out.println();

        for (int i = 0; i < sorts.length; i++) {
            compareSortOfAlmostSorted(sorts[i]);
        }

        System.out.println();

        for (int i = 0; i < sorts.length; i++) {
            compareSortOfNotSorted(sorts[i]);
        }
    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private static void compareSortOfNotSorted(ISort s1) {
        int [] notSortedArray1;

        System.out.println("Not Sorted Arrays");
        notSortedArray1 = IntegersGenerator.createRandomArrayGenerator(amountOfElements);

        s1.sort(notSortedArray1);
    }

    private static void compareSortOfAlmostSorted (ISort s1) {
        int [] almostSortedArray1;

        System.out.println("Almost Sorted Arrays");
        almostSortedArray1 = IntegersGenerator.createAlmostSortedArray(amountOfElements);

        s1.sort(almostSortedArray1);
    }

    private static void compareSortOfSorted(ISort s1) {
        int [] sortedArray1;

        System.out.println("Sorted Array");
        sortedArray1 = IntegersGenerator.createAscendingSortedArray(amountOfElements);

        s1.sort(sortedArray1);
    }
    //</editor-fold>


}

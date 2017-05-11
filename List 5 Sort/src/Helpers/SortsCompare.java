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

        compareSortOfSorted(sorts);

        System.out.println();

        compareSortOfAlmostSorted(sorts);

        System.out.println();

        compareSortOfNotSorted(sorts);
    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private static void compareSortOfNotSorted(ISort... sorts) {

        System.out.println("Not Sorted Array\n");

        for (int i = 0; i < sorts.length; i++) {
            int [] notSortedArray1;

            notSortedArray1 = IntegersGenerator.createRandomArrayGenerator(amountOfElements);

            sorts[i].sort(notSortedArray1);
        }


    }

    private static void compareSortOfAlmostSorted (ISort... sorts) {


        System.out.println("Almost Sorted Array\n");

        for (int i = 0; i < sorts.length; i++) {

            int [] almostSortedArray1;

            almostSortedArray1 = IntegersGenerator.createAlmostSortedArray(amountOfElements);

            sorts[i].sort(almostSortedArray1);
        }

    }

    private static void compareSortOfSorted(ISort... sorts) {


        System.out.println("Sorted Array\n");

        for (int i = 0; i < sorts.length; i++) {

            int [] sortedArray1;

            sortedArray1 = IntegersGenerator.createAscendingSortedArray(amountOfElements);

            sorts[i].sort(sortedArray1);
        }

    }
    //</editor-fold>


}

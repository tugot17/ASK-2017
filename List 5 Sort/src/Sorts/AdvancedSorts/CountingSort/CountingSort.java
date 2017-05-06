package Sorts.AdvancedSorts.CountingSort;

import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class CountingSort extends Sort implements ISort {

    //<editor-fold desc="Elements">
    private int theBiggestNumber;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public CountingSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int[] array) {

    }

    @Override
    public void sort() {
        theBiggestNumber = findTheBiggest();

        int[] helperArray = new int[array.length];

        int helper;


        for (int i = 0; i < array.length; i++) {
            helperArray[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            helperArray[array[i]]++;
        }

//        for (int i=array)


    }

    private int findTheBiggest() {
        int theBiggestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > theBiggestNumber)
                theBiggestNumber = array[i];

        }
        return theBiggestNumber;
    }
    //</editor-fold>
}

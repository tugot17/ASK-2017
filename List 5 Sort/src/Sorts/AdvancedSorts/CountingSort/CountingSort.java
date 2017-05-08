package Sorts.AdvancedSorts.CountingSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class CountingSort extends Sort implements ISort {

    //<editor-fold desc="Elements">
    private int theBiggestNumber;
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int[] array) {

    }

    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
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

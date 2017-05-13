package Sorts.SimpleSorts.SelectSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class SelectSort extends Sort implements ISort {

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }


    @Override
    public void sort(int[] array) {

        int theBiggest;
        int helper;

        stopper.start();
        for (int i=array.length - 1; i > 0; i--) {
            theBiggest = 0;

            for (int j = 1; j <= i; j++) {
                if (array[j] > array[theBiggest]) {
                    theBiggest = j;
                }
                amountOfComparasion++;
            }

            if (theBiggest != i) {
                helper = array[theBiggest];
                array[theBiggest] = array[i];
                array[i] = helper;
            }

        }
        stopper.stop();

        SortMessage.showSortInformations("Select", array.length, amountOfComparasion, stopper.getResult());

        amountOfComparasion = 0;

    }
    //</editor-fold>

}

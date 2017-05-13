package Sorts.AdvancedSorts.MergeSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 21.04.2017.
 */
public class MergeSort extends Sort implements ISort {

    //<editor-fold desc="Elements">
    private int[] helperArray;
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    public void sort(int[] array) {
        this.array = array;
        int number = array.length;
        this.helperArray = new int[number];

        stopper.start();
        mergesort(0, number - 1);
        stopper.stop();

        SortMessage.showSortInformations("Merge", array.length, amountOfComparasion, stopper.getResult());

        amountOfComparasion = 0;
    }

    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = (low + high)  / 2;

            mergesort(low, middle);

            mergesort(middle + 1, high);

            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            helperArray[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helperArray[i] <= helperArray[j]) {
                array[k] = helperArray[i];
                i++;
            } else {
                array[k] = helperArray[j];
                j++;
            }
            k++;
            amountOfComparasion++;
        }

        while (i <= middle) {
            array[k] = helperArray[i];
            k++;
            i++;
        }

    }
    //</editor-fold>

}

package Sorts.AdvancedSorts.MergeSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 21.04.2017.
 */
public class MergeSort extends Sort implements ISort {
    private int[] helperArray;

    public MergeSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }

    @Override
    public void sort() {
        this.array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    private int number;

    public void sort(int[] array) {
        this.array = array;
        number = array.length;
        this.helperArray = new int[number];

        stoper.start();
        mergesort(0, number - 1);
        stoper.stop();

        SortMessage.showSortInformations("Merge", array.length, amountOfComparasions, stoper.getResult());

    }

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
            amountOfComparasions++;
        }

        while (i <= middle) {
            array[k] = helperArray[i];
            k++;
            i++;
        }

    }


    //</editor-fold>


}

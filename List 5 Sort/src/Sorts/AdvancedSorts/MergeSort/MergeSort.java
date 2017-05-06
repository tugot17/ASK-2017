package Sorts.AdvancedSorts.MergeSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 21.04.2017.
 */
public class MergeSort extends Sort implements ISort {
    private int[] numbers;
    private int[] helper;

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
        this.numbers = array;
        number = array.length;
        this.helper = new int[number];

        stoper.start();
        mergesort(0, number - 1);
        stoper.stop();

        SortMessage.showSortInformations("Merge", array.length, amountOfComparasions, stoper.getResult());

    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }


    //</editor-fold>


}

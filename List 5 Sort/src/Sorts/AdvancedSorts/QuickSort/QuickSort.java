package Sorts.AdvancedSorts.QuickSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class QuickSort extends Sort implements ISort {

    //<editor-fold desc="Constructors">
    public QuickSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void sort() {
        this.array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    @Override
    public void sort(int[] values) {
        if (values ==null || values.length==0){
            return;
        }
        this.array = values;
        amountOfSortedElements = values.length;
        quicksort(0, amountOfSortedElements - 1);

        SortMessage.showSortInformations("Merge", array.length, amountOfComparasions, stoper.getResult());

    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high-low)/2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
                amountOfComparasions++;
            }

            while (array[j] > pivot) {
                j--;
                amountOfComparasions++;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
                amountOfComparasions++;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //</editor-fold>
}

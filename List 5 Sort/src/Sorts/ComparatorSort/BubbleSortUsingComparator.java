package Sorts.ComparatorSort;

import Helpers.Stopper;
import Messages.SortMessage;

import java.util.Comparator;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class BubbleSortUsingComparator<T> {

    //<editor-fold desc="Elements">
    Comparator<T> comparator;

    T[] array;

    Stopper stopper;

    int amountOfComparasions;
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public BubbleSortUsingComparator(int amountOfSortedElements, Comparator<T> comparator) {
        this.comparator = comparator;
        this.stopper = new Stopper("sort stopper");
        amountOfComparasions = 0;
    }


    public void sort(T[] array) {

        this.array = array;
        T helper;

        stopper.start();
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    helper = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = helper;
                }
                amountOfComparasions++;

            }
        }
        stopper.stop();

        SortMessage.showSortInformations("Bubble", array.length, amountOfComparasions, stopper.getResult());

    }
    //</editor-fold>

}

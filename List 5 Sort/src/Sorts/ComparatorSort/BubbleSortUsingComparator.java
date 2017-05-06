package Sorts.ComparatorSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Helpers.Stoper;
import Messages.SortMessage;
import Sorts.ISort;

import java.util.Comparator;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class BubbleSortUsingComparator<T> {

    //<editor-fold desc="Elements">
    Comparator<T> comparator;

    T[] array;

    Stoper stoper;

    int amountOfComparasions;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public BubbleSortUsingComparator(int amountOfSortedElements, Comparator<T> comparator) {
        this.comparator = comparator;
        this.stoper = new Stoper("sortById stopper");
        amountOfComparasions = 0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Metods">
    public void sort(T[] array) {

        this.array = array;
        T helper;

        stoper.start();
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
        stoper.stop();

        SortMessage.showSortInformations("Bubble", array.length, amountOfComparasions, stoper.getResult());

    }
    //</editor-fold>

}

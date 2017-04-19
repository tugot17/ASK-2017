package Sorts.SelectSort;

import Helpers.Sort;
import Helpers.Stoper;
import Messages.SortMessage;
import Sorts.ISort;

import java.lang.reflect.Array;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class SelectSort extends Sort implements ISort {


    //<editor-fold desc="Constructors">

    public SelectSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }

    //</editor-fold>

    @Override
    public int[] sort() {
        return new int[0];
    }

    @Override
    public void sortLocally() {

    }

    @Override
    public int []sort(int [] array) {
        int[] helperArray = new int[array.length];
        int helper;

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[array.length - 1]) {
                    helper = array[i];
                    array[i] = array[array.length - 1];
                    array[array.length - 1] = helper;
                }

            }
        }


        SortMessage.showSortInformations("Select", array.length, amountOfComparasions, stoper.getResult());
        return array;
    }

}

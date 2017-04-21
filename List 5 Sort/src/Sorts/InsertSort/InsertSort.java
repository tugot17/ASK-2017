package Sorts.InsertSort;

import Helpers.Sort;
import Helpers.Stoper;
import Messages.SortMessage;
import Sorts.ISort;

import java.lang.reflect.Array;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class InsertSort extends Sort implements ISort {


    //<editor-fold desc="Constructors">

    public InsertSort(int amountOfSortedElements) {
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
    public int[] sort(int[] array) {



        SortMessage.showSortInformations("Insert", array.length, amountOfComparasions, stoper.getResult());
        return array;
    }

}

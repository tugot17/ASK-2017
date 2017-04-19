package Sorts.InsertSort;

import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class InsertSort extends Sort implements ISort {

    //<editor-fold desc="Constructors">
    public InsertSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public int[] sort() {
        return new int[0];
    }

    @Override
    public void sortLocally() {

    }

    @Override
    public int [] sort(int [] array) {
        return array;
    }
    //</editor-fold>

}

package Sorts.MergeSort;

import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 21.04.2017.
 */
public class MergeSort extends Sort implements ISort {


    private int [] extraArray;

    //<editor-fold desc="Constructors">
    public MergeSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }
    //</editor-fold>


    @Override
    public void sort() {

    }


    // at this moment it doesn't work I'm not sure why

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int[] array) {

        extraArray = new int[array.length];
        this.array= array;
        mergeSort(0, array.length-1);

    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private void mergeSort(int beginning, int end) {

        if(beginning<end){
            int middle = (beginning + end ) / 2;
            mergeSort(beginning, middle);
            mergeSort(middle+1, end);
            mergeParts(beginning, middle, end);
        }

    }


    private void mergeParts(int beginning, int middle, int end) {
        for (int i=beginning; i<=end; i++){
            extraArray[i] = array[i];
        }

        int i = beginning;
        int j = middle;
        int k = beginning;

        while (i <= middle && j <= end) {
            if (extraArray[i] <= extraArray[end]) {
                array[k] = extraArray[i];
                i++;
            }

            else {
                array[k] = extraArray [j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = extraArray[i];
            k++;
            i++;
        }
    }
    //</editor-fold>


}

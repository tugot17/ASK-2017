package Sorts.SimpleSorts.InsertSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class InsertSort extends Sort implements ISort {

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }


    @Override
    public void sort(int[] array) {

        this.array = array;

        int key;
        int i;

        stopper.start();
        for (int j = 1; j < array.length; j++)
        {
            key = array[ j ];
            for (i = j - 1; (i >= 0 && (array[i] > key)); i--)
            {
                array[ i+1 ] = array[ i ];
                amountOfComparasions++;
            }
            array[ i+1 ] = key;
        }
        stopper.stop();


        SortMessage.showSortInformations("Insert", array.length, amountOfComparasions, stopper.getResult());

        amountOfComparasions = 0;
    }
    //</editor-fold>

}

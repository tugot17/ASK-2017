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


        int key;
        int i;

        stoper.start();
        for (int j = 1; j < array.length; j++)
        {
            key = array[ j ];
            for(i = j - 1; (i >= 0 && (array[ i ] >key)) ; i--)   // Bigger values are moving up
            {
                array[ i+1 ] = array[ i ];
                amountOfComparasions++;
            }
            array[ i+1 ] = key;
        }
        stoper.stop();


        SortMessage.showSortInformations("Insert", array.length, amountOfComparasions, stoper.getResult());

        return array;
    }

}

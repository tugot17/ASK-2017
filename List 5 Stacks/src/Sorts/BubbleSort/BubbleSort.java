package Sorts.BubbleSort;

import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class BubbleSort implements ISort {






    @Override
    public int [] sort(int [] array) {

        int helper=0;
        int amountOfComparasion=0;

        for (int i=0; i<array.length-1; i++)
        {
            for (int j=0; j<array.length-1; j++)
            {
                if (array[j]>array[j+1])
                {
                    helper=array[j];
                    array[j]=array[j+1];
                    array[j+1]=helper;
                }
                amountOfComparasion++;
            }
        }

        SortMessage.showSortInformations("Bouble", array.length, amountOfComparasion, 0);

        return array;
    }
}

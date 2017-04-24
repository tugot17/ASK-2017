package Sorts.BubbleSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 23.04.2017.
 */
public class ShakerSort extends Sort implements ISort{
    public ShakerSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }

    @Override
    public void sort() {
        array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    @Override
    public void sort(int [] array) {

        boolean isElementChanged;

        this.array = array;
        int helper;

        stoper.start();
        for (int i = array.length - 1; isElementChanged=false &&  i >= 0; i--)
        {
            isElementChanged=false;

            for (int j = 0; j < i; j++)
            {
                if (array[j]>array[j+1])
                {
                    helper=array[j];
                    array[j]=array[j+1];
                    array[j+1]=helper;
                    isElementChanged=true;
                }
                amountOfComparasions++;


            }

            for (int j = i-1; j > array.length-i; j--)
            {
                if (array[j]>array[j+1])
                {
                    helper=array[j];
                    array[j]=array[j+1];
                    array[j+1]=helper;
                    isElementChanged=true;
                }
                amountOfComparasions++;


            }
        }
        stoper.stop();

        SortMessage.showSortInformations("Shaker", array.length, amountOfComparasions, stoper.getResult());

    }


}

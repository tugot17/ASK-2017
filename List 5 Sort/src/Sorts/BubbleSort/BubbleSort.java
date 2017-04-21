package Sorts.BubbleSort;

import Helpers.Stoper;
import Messages.SortMessage;
import Sorts.ISort;
import Helpers.RandomGenerator;
import Helpers.Sort;


/**
 * Created by pmazurek on 19.04.2017.
 */
public class BubbleSort extends Sort implements ISort {

    //<editor-fold desc="Constructors">

    public BubbleSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }

    //</editor-fold>

    //<editor-fold desc="Public Methods">

    // don't sort array, sort its copy
    @Override
    public void sortLocally() {
        array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        int[] helperArray = array;
        sort(helperArray);

    }

    @Override
    public int [] sort() {
        array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        return sort(array);
    }

    @Override
    public int [] sort(int [] array) {
        int helper;
        double amountOfComparasion=0;

        stoper.start();
        for (int i = array.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
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
        stoper.stop();

        SortMessage.showSortInformations("Bubble", array.length, amountOfComparasion, stoper.getResult());

        return array;
    }


    //</editor-fold>
}

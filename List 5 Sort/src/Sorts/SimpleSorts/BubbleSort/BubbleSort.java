package Sorts.SimpleSorts.BubbleSort;

import Messages.SortMessage;
import Sorts.ISort;
import Helpers.IntegersGenerator;
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


    @Override
    public void sort() {
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

         sort(array);
    }

    @Override
    public void sort(int [] array) {

        this.array = array;
        int helper;

        stopper.start();
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
                amountOfComparasions++;

            }
        }
        stopper.stop();

        SortMessage.showSortInformations("Bubble", array.length, amountOfComparasions, stopper.getResult());

    }


    //</editor-fold>
}

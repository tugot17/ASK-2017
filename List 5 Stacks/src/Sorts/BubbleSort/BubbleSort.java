package Sorts.BubbleSort;

import Helpers.Stoper;
import Messages.SortMessage;
import Sorts.ISort;
import Helpers.RandomGenerator;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class BubbleSort implements ISort {

    //<editor-fold desc="Elements">
    private int amountOfSortedElements;
    private int [] array;
    Stoper stoper;

    //</editor-fold>

    //<editor-fold desc="Constructors">
    public BubbleSort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        this.array= new int[amountOfSortedElements];
        stoper = new Stoper("sort stoper");
    }
    //</editor-fold>

    // don't sort array sort its copy
    @Override
    public void sortLocally() {

        int [] helperArray = array;
        sort(helperArray);

    }



    @Override
    public int [] sort() {

        array= RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);

        return array;
    }

    @Override
    public int [] sort(int [] array) {

        int helper=0;
        double amountOfComparasion=0;

        stoper.start();
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
        stoper.stop();

        SortMessage.showSortInformations("Bubble", array.length, amountOfComparasion, stoper.getResult());

        return array;
    }
}

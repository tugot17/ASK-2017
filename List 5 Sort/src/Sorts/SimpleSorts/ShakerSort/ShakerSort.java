package Sorts.SimpleSorts.ShakerSort;

import Helpers.RandomGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 23.04.2017.
 */
public class ShakerSort extends Sort implements ISort{


    //<editor-fold desc="Constructors">
    public ShakerSort(int amountOfSortedElements) {
        super(amountOfSortedElements);
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    @Override
    public void sort() {
        array = RandomGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    @Override
    public void sort(int [] array) {

        this.array = array;
        int helper;

        int end = array.length - 1;
        int begenning = 0;


        stoper.start();
        boolean swapped;
        do {
            swapped = false;
            for (int i = begenning; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }

                amountOfComparasions++;
            }

            end--;

            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = end; i >= begenning; i--) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }
                amountOfComparasions++;

            }

            begenning++;

        } while (swapped);

        stoper.stop();

        SortMessage.showSortInformations("Shaker", array.length, amountOfComparasions, stoper.getResult());

    }
    //</editor-fold>


}

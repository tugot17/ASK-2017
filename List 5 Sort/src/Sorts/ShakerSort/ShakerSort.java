package Sorts.ShakerSort;

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

        this.array = array;
        int helper;


        stoper.start();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }
            }
        } while (swapped);

        stoper.stop();

        SortMessage.showSortInformations("Shaker", array.length, amountOfComparasions, stoper.getResult());

    }


}

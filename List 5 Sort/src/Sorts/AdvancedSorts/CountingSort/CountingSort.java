package Sorts.AdvancedSorts.CountingSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class CountingSort extends Sort implements ISort {


    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    @Override
    public void sort(int[] array) {
        int biggestNumber = findBiggestNumeber(array);

        int [] specificNumberReiterationsArray = countReiterationsOfSpcyficNumber(array, biggestNumber); //it keeps amount of specific number reiterations

        int [] resultArray = putNumbersOnProperPlacesInArray(specificNumberReiterationsArray, array.length);

        for (int i = 0; i < array.length; i++)
            array[i] = resultArray[i];

    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private int[] putNumbersOnProperPlacesInArray(int[] specificNumberReiterationsArray, int length) {
        int [] resultArray = new int[length];

        int number = 0;

        for (int i = 0; i < specificNumberReiterationsArray.length; i++) {

            while (specificNumberReiterationsArray[i] > 0) {
                resultArray[number] = i;
                number++;
                specificNumberReiterationsArray[i]--;
            }
        }

        return resultArray;


    }

    private int[] countReiterationsOfSpcyficNumber(int[] array, int biggestNumber) {
        int [] specificNumberReiterationsArray = new int[biggestNumber + 1];

        for (int i = 0; i < array.length; i++)
            specificNumberReiterationsArray[array[i]]++;

        return specificNumberReiterationsArray;
    }

    private int findBiggestNumeber(int [] arrayOfNumbers) {

        int theBiggest = arrayOfNumbers[0];

        for (int i = 1; i < arrayOfNumbers.length ; i++) {
            if (theBiggest < arrayOfNumbers[i])
                theBiggest = arrayOfNumbers[i];
        }

        return theBiggest;
    }
    //</editor-fold>


}

package Helpers;

import java.util.Random;


/**
 * Created by pmazurek on 19.04.2017.
 */
public class IntegersGenerator {

    //<editor-fold desc="Public Methods">
    public static int [] createRandomArrayGenerator(int amountOfElements) {
        int [] array = new int[amountOfElements];

        for (int i = 0; i < amountOfElements; i++)
        {
            array[i] = randomInteger();
        }

        return array;
    }

    public static int [] createAscendingSortedArray(int amountOfElements) {
        int [] array = new int[amountOfElements];

        for (int i = 0; i < amountOfElements; i++)
        {
            array[i] = i + 1;  // i want my first number was 1 not 0
        }

        return array;
    }

    public static int [] createDescendingSortedArray(int amountOfElements) {
        int [] array = new int[amountOfElements];

        for (int i = 0; i < amountOfElements; i++)
        {
            array[i] = amountOfElements - (i+1) ;  // i want my last number was 1 not 0
        }

        return array;
    }

    public static int [] createAlmostSortedArray(int amountOfElements) {
        int [] array = new int[amountOfElements];

        for (int i = 0; i < amountOfElements; i++)
        {
            if (i % 17 != 0 )
                array[i] = i+1;
            else
                array[i] = randomInteger();

        }

        return array;
    }

    //</editor-fold>

    //<editor-fold desc="Private Methods">
    static private int randomInteger()
    {

        Random rand = new Random();

        return rand.nextInt(50) + 1;
    }
    //</editor-fold>

}

package Helpers;

import java.util.Random;


/**
 * Created by pmazurek on 19.04.2017.
 */
public class RandomGenerator {

    //<editor-fold desc="Public Methods">
    public static int [] createRandomArrayGenerator(int amountOfElements)
    {
        int [] array = new int[amountOfElements];

        for (int i = 0; i < amountOfElements; i++)
        {
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

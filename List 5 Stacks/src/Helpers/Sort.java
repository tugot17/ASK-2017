package Helpers;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class Sort {
    protected int amountOfSortedElements;
    protected int[] array;
    protected Stoper stoper;
    protected double amountOfComparasions;


    public Sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        this.array = new int[amountOfSortedElements];
        stoper = new Stoper("sort stoper");
        amountOfComparasions = 0;
    }


}


package Helpers;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class Sort {

    //<editor-fold desc="Elements">
    protected int amountOfSortedElements;
    protected int[] array;
    protected Stoper stoper;
    protected double amountOfComparasions;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        this.array = new int[amountOfSortedElements];
        stoper = new Stoper("sort stoper");
        amountOfComparasions = 0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public double getAmountOfComparasions() {
        return amountOfComparasions;
    }

    public double getLastSortTime() {
        return stoper.getResult();
    }
    //</editor-fold>
}


package Helpers;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class Sort {

    //<editor-fold desc="Elements">
    protected int amountOfSortedElements;
    protected int[] array;
    protected Stopper stopper;
    protected double amountOfComparasions;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        this.array = new int[amountOfSortedElements];
        stopper = new Stopper("sort stopper");
        amountOfComparasions = 0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public double getAmountOfComparasions() {
        return amountOfComparasions;
    }

    public double getLastSortTime() {
        return stopper.getResult();
    }

    public void showArray() {
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //</editor-fold>
}


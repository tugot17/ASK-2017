package Helpers;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class Sort {

    //<editor-fold desc="Elements">
    protected int amountOfSortedElements;
    protected int[] array;
    protected Stopper stopper;
    protected double amountOfComparasion;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Sort() {
        stopper = new Stopper("sort stopper");
        amountOfComparasion = 0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public double getAmountOfComparasion() {
        return amountOfComparasion;
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


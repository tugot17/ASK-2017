import Sorts.ISort;
import Sorts.SelectSort.SelectSort;

public class Main {

    public static void main(String[] args) {

//        ISort sort = new BubbleSort(150000);
        ISort sort = new SelectSort(50000);
        sort.sort();

    }
}

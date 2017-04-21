import Sorts.BubbleSort.BubbleSort;
import Sorts.ISort;
import Sorts.InsertSort.InsertSort;
import Sorts.SelectSort.SelectSort;

public class Main {

    public static void main(String[] args) {

//        ISort sort = new BubbleSort(150000);
        ISort sort = new InsertSort(50000);
        sort.sort();

    }
}

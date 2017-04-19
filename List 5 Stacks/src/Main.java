import Sorts.BubbleSort.BubbleSort;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        BubbleSort sort = new BubbleSort(150000);
        sort.sortLocally();

    }
}

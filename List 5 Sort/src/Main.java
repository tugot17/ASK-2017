import Sorts.ISort;
import Sorts.MergeSort.MergeSort;
import Sorts.SelectSort.SelectSort;

public class Main {

    public static void main(String[] args) {

//        ISort sort = new BubbleSort(150000);
         ISort sort = new MergeSort(50000);
//        sort.sort();

        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};

        sort.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }






    }
}

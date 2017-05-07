
import Helpers.IntegersGenerator;
import Helpers.SortsCompare;
import Sorts.AdvancedSorts.MergeSort.MergeSort;
import Sorts.AdvancedSorts.QuickSort.QuickSort;
import Sorts.ComparatorSort.ShowSortUsingComparator;
import Sorts.ISort;
import Sorts.SimpleSorts.BubbleSort.BubbleSort;
import Sorts.SimpleSorts.InsertSort.InsertSort;
import Sorts.SimpleSorts.SelectSort.SelectSort;
import Sorts.SimpleSorts.ShakerSort.ShakerSort;

public class Main {

    public static void main(String[] args) {

        ISort bubbleSort = new BubbleSort(5000);
        ISort selectSort = new SelectSort(5000);
        ISort insertSort = new InsertSort(5000);
        ISort shakerSort = new ShakerSort(5000);
        ISort quickSort  = new QuickSort(5000);

        SortsCompare.comapare2Sorts(bubbleSort, quickSort);
//
//        bubbleSort.sort();
//        selectSort.sort();
//        insertSort.sort();
//        shakerSort.sort();

//        ShowSortUsingComparator.showStudentsCompareById();
//        ShowSortUsingComparator.showStudentCompareBySurname();

//        int [] arrayToSort = IntegersGenerator.createAlmostSortedArray(1000);
//
//        MergeSort mergeSort = new MergeSort(1);
//
//        mergeSort.sort(arrayToSort);


    }
}


import Helpers.IntegersGenerator;
import Helpers.SortsCompare;
import Sorts.AdvancedSorts.CountingSort.CountingSort;
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

        ISort bubbleSort   = new BubbleSort();
        ISort selectSort   = new SelectSort();
        ISort insertSort   = new InsertSort();
        ISort shakerSort   = new ShakerSort();
        ISort quickSort    = new QuickSort();
        ISort mergeSort    = new MergeSort();
        ISort countingSort = new CountingSort();


        SortsCompare.compareSorts(quickSort);
//
//        SortsCompare.comapare2Sorts(bubbleSort, mergeSort);

//        SortsCompare.comapare2Sorts(insertSort, quickSort);
//
//        SortsCompare.comapare2Sorts(insertSort, mergeSort);
//
//        SortsCompare.comapare2Sorts(shakerSort, bubbleSort);
//
//        SortsCompare.comapare2Sorts(selectSort, mergeSort);


//        CountingSort countingSort = new CountingSort();
//
//        countingSort.sort(33);


    }
}

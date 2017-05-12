
import Helpers.IntegersGenerator;
import Helpers.SortsCompare;
import Ques.HeapOrderedListPriorityQueue;
import Ques.IntegerComparator;
import Ques.Queue;
import Sorts.AdvancedSorts.CountingSort.CountingSort;
import Sorts.AdvancedSorts.MergeSort.MergeSort;
import Sorts.AdvancedSorts.QuickSort.QuickSort;
import Sorts.ComparatorSort.ShowSortUsingComparator;
import Sorts.ComparatorSort.StudentComparatorSurname;
import Sorts.ISort;
import Sorts.SimpleSorts.BubbleSort.BubbleSort;
import Sorts.SimpleSorts.InsertSort.InsertSort;
import Sorts.SimpleSorts.SelectSort.SelectSort;
import Sorts.SimpleSorts.ShakerSort.ShakerSort;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

//        ISort bubbleSort   = new BubbleSort();
//        ISort selectSort   = new SelectSort();
//        ISort insertSort   = new InsertSort();
//        ISort shakerSort   = new ShakerSort();
//        ISort quickSort    = new QuickSort();
//        ISort mergeSort    = new MergeSort();
//        ISort countingSort = new CountingSort();
//
//
//        SortsCompare.compareSorts(insertSort, quickSort);

        Comparator comparator = new IntegerComparator();

        Queue queue = new HeapOrderedListPriorityQueue(comparator);

    }
}

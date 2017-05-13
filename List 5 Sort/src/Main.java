
import Helpers.SortsCompare;
import Messages.QueueMessage;
import Ques.HeapOrderedListPriorityQueue;
import Ques.IntegerComparator;
import Sorts.AdvancedSorts.CountingSort.CountingSort;
import Sorts.AdvancedSorts.MergeSort.MergeSort;
import Sorts.AdvancedSorts.QuickSort.QuickSort;
import Sorts.ISort;
import Sorts.SimpleSorts.BubbleSort.BubbleSort;
import Sorts.SimpleSorts.InsertSort.InsertSort;
import Sorts.SimpleSorts.SelectSort.SelectSort;
import Sorts.SimpleSorts.ShakerSort.ShakerSort;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ISort bubbleSort   = new BubbleSort();
        ISort selectSort   = new SelectSort();
        ISort insertSort   = new InsertSort();
        ISort shakerSort   = new ShakerSort();
        ISort quickSort    = new QuickSort();
        ISort mergeSort    = new MergeSort();
        ISort countingSort = new CountingSort();


//        SortsCompare.compareSorts(insertSort, quickSort); // that method can get variable amount of ISort elements so u can compere as many sort algortihms as u wish




        HeapOrderedListPriorityQueue queue;

        Comparator comparator;

        comparator = new IntegerComparator();

        queue = new HeapOrderedListPriorityQueue(comparator);

        queue.enqueue(2);
        queue.enqueue(33);
        queue.enqueue(221);
        queue.enqueue(3);
        queue.enqueue(1);

        QueueMessage.showQueueInformations(" Heap Ordered List Priority", queue.getAmountOfComparation(), queue.getAmountOfSwaps());

    }
}

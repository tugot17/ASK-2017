
import Sorts.AdvancedSorts.MergeSort.MergeSort;
import Sorts.ComparatorSort.ShowSortUsingComparator;
import Sorts.ISort;

public class Main {

    public static void main(String[] args) {

//        ISort bubbleSort = new BubbleSort(5000);
//        ISort selectSort = new SelectSort(5000);
//        ISort insertSort = new InsertSort(5000);
//        ISort shakerSort = new ShakerSort(5000);
//
//        bubbleSort.sort();
//        selectSort.sort();
//        insertSort.sort();
//        shakerSort.sort();

//        ShowSortUsingComparator.showStudentsCompareById();
//        ShowSortUsingComparator.showStudentCompareBySurname();

        ISort mergeSort = new MergeSort(3000);
        mergeSort.sort();

    }
}

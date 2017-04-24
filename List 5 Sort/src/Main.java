import SortedElements.Student;
import SortedElements.StudentComparatorId;
import SortedElements.StudentComparatorSurname;
import Sorts.BubbleSort.BubbleSort;
import Sorts.BubbleSort.BubbleSortUsingComparator;
import Sorts.ISort;
import Sorts.InsertSort.InsertSort;
import Sorts.MergeSort.MergeSort;
import Sorts.SelectSort.SelectSort;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ISort bubbleSort = new BubbleSort(5000);
        ISort selectSort = new SelectSort(5000);
        ISort insertSort = new InsertSort(5000);

        bubbleSort.sort();
        selectSort.sort();
        insertSort.sort();


//        Comparator <Student> idComparator = new StudentComparatorSurname();
//        BubbleSortUsingComparator sort= new  BubbleSortUsingComparator<Student>(1, idComparator);
//
//        Student [] array = new Student[4];
//        array[0] = new Student(11, "Stefan", "Banach");
//        array[1] = new Student(2, "Isaac", "Newton");
//        array[2] = new Student(3, "Zdzisław", "Ulam");
//        array[3] = new Student(4, "Stanisław", "Ulam");
//
//
//        sort.sort(array);
//
//        for(int i = 0; i<array.length; i++)
//        {
//            System.out.println(array[i]);
//        }


    }
}

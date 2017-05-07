package Sorts.ComparatorSort;

import java.util.Comparator;
/**
 * Created by pmazurek on 06.05.2017.
 */
public class ShowSortUsingComparator {

    //<editor-fold desc="Comparators">
    private static Comparator<Student> idComparator = new StudentComparatorId();
    private static Comparator<Student> surnameComparator = new StudentComparatorSurname();
    private static BubbleSortUsingComparator sortById = new  BubbleSortUsingComparator<Student>(1, idComparator);
    private static BubbleSortUsingComparator sortBySurname = new  BubbleSortUsingComparator<Student>(1, surnameComparator);


    //</editor-fold>

    //<editor-fold desc="Comapare By Id and Surname Examples">
    public static void showStudentsCompareById() {
        System.out.println("Compare by id");
        Student[] array = new Student[4];
        array[0] = new Student(11, "Stefan", "Banach");
        array[1] = new Student(2, "Isaac", "Newton");
        array[2] = new Student(3, "Zdzisław", "Ulam");
        array[3] = new Student(4, "Stanisław", "Ulam");

        sortById.sort(array);

        showArray(array);

    }

    public static void showStudentCompareBySurname() {
        System.out.println("Compare by surname if surnames same by name");
        Student[] array = new Student[4];
        array[0] = new Student(11, "Stefan", "Banach");
        array[1] = new Student(2, "Isaac", "Newton");
        array[2] = new Student(3, "Zdzisław", "Ulam");
        array[3] = new Student(4, "Stanisław", "Ulam");


        sortBySurname.sort(array);

        showArray(array);


    }
    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private static void showArray(Student [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    //</editor-fold>

}

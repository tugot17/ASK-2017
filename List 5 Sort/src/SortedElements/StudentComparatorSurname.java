package SortedElements;

import java.util.Comparator;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class StudentComparatorSurname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        String left = o1.getSurname();
        String right = o2.getSurname();


        int result = ((Comparable) left).compareTo(right);

        if (result == 0) {

            left = o1.getName();
            right = o2.getName();
            result = ((Comparable) left).compareTo(right);
        }

        return result;
    }
}

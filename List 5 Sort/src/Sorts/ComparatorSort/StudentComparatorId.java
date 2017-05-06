package Sorts.ComparatorSort;

import java.util.Comparator;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class StudentComparatorId implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        int left = o1.getId();
        int right = o2.getId();

        return ((Comparable) left).compareTo(right);
    }
}

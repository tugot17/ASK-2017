package SortedElements;

/**
 * Created by pmazurek on 24.04.2017.
 */
public class Student implements Comparable<Student> {
    private  int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Student other) {

        return this.id-other.id;
    }

    public int compareToSurname(Student other) {

        int result =  this.surname.compareTo(other.surname);

        if (result==0)
            return this.name.compareTo(other.name);

        return result;
    }
}

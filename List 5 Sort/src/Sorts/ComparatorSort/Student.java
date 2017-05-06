package Sorts.ComparatorSort;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Student other) {

        return this.id-other.id;
    }

    @Override
    public String toString() {
        return id + " " + " " + name + " " + surname;
    }
}

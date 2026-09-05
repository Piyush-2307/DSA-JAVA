package collectionInterface;

import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student(1,"peeyush");
        Student s2 = new Student(2,"peeyush");
        Student s3 = new Student(1,"peeyush");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);
    }
}

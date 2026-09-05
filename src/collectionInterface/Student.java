package collectionInterface;

import java.security.PublicKey;
import java.util.Objects;

public class Student {

    public int rollNo;
    public String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object no) {
        if (no == null || getClass() != no.getClass()) return false;
        Student student = (Student) no;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

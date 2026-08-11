package OOPS.D01objCreation;

public class StudentObj {
    public static void main(String[] args) {
        //Default Constructor //attr. --> garbage
        StudentClassTemplate A = new StudentClassTemplate();
        A.id = 1;
        A.name = "Peeyush";
        A.age = 22;
        A.noOfSubjects = 5;
        System.out.println("Student id is: " + A.id);
        System.out.println("Student name is: " + A.name);
        System.out.println("Student age is: " + A.age);
        System.out.println("Student no of subjects are: " + A.noOfSubjects);

        A.bunk();
        A.study();
        A.sleep();

        //Parameterized Constructor
        StudentClassTemplate B = new StudentClassTemplate(2, "Arora", 22, 6);
        System.out.println("Student id is: " + B.id);
        System.out.println("Student name is: " + B.name);
        System.out.println("Student age is: " + B.age);
        System.out.println("Student no of subjects are: " + B.noOfSubjects);

        B.bunk();
        B.study();
        B.sleep();

        //Copy ctor
        StudentClassTemplate C = new StudentClassTemplate(B);
        System.out.println("Student id is: " + C.id);
        System.out.println("Student name is: " + C.name);
        System.out.println("Student age is: " + C.age);
        System.out.println("Student no of subjects are: " + C.noOfSubjects);

        C.bunk();
        C.study();
        C.sleep();
    }
}

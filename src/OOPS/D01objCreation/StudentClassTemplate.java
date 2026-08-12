package OOPS.D01objCreation;

public class StudentClassTemplate {
    //Attributer
    public int id;
    public String name;
    public int age;
    public int noOfSubjects;

    //Default Constructor //attr. --> garbage
    public StudentClassTemplate(){
        System.out.println("Student Default ctor called");
    }

    //Parameterized Constructor
    public StudentClassTemplate(int id, String name , int age, int noOfSubjects){
        System.out.println("Student Parameterized ctor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.noOfSubjects = noOfSubjects;
    }

    //Copy ctor
    public StudentClassTemplate(StudentClassTemplate B){
        System.out.println("Student Copy ctor called");
        this.id = B.id;
        this.name = B.name;
        this.age = B.age;
        this.noOfSubjects = B.noOfSubjects;
    }

    //Behaivour
    public void study() {
        System.out.println(name + ": Studying");
    }

    public void sleep() {
        System.out.println(name + ": Sleeping");
    }

    public void bunk() {
        System.out.println(name + ": Bunk");
    }
}

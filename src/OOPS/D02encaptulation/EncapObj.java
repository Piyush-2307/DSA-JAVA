package OOPS.D02encaptulation;

public class EncapObj {
    public static void main(String[] args) {

        EncapClassTemplate A = new EncapClassTemplate(1,"Peeyush",55,5,"Koi nahi hai");
        System.out.println("Student id is: " + A.id);
        System.out.println("Student name is: " + A.name);
        A.setAge(22);
        System.out.println("Student age is: " + A.getAge());
        System.out.println("Student no of subjects are: " + A.noOfSubjects);
        System.out.println("Student gf's name: " + A.getGf("Mumma"));



        A.bunk();
        A.study();
        A.sleep();
    }
}

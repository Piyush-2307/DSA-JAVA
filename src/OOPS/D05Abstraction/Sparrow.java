package OOPS.D05Abstraction;

//IMPLEMENTATION
//old way
//public class Sparrow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }

//New way
class Sparrow implements Bird, Walk{

    @Override
    public void Walking() {
        System.out.println("Sparrow walking");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}

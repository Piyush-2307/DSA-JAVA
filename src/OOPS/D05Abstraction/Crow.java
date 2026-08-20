package OOPS.D05Abstraction;

//public class Crow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Crow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating");
//    }


class Crow implements Bird, Walk{

    @Override
    public void Walking() {
        int a = Walk.legs;
        System.out.println(a);
        System.out.println("Crow walking");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }

}

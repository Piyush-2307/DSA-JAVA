package OOPS.D05Abstraction;

// INTERFACE
//abstract class Bird{
//
//    abstract void fly();
//
//    abstract void eat();
//
//}
interface Bird{

    void fly();

    void eat();

}

interface Walk{
    int legs = 4;
    void Walking();

}

//class Sparrow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}

public class Main {

    public static void BirdStuff(Bird b){
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {

        BirdStuff(new Sparrow());
        BirdStuff(new Crow());

//        Bird bird = new Sparrow();
//        bird.fly();
//        bird.eat();
//
//        bird = new Crow();
//        bird.fly();
//        bird.eat();


    }
}

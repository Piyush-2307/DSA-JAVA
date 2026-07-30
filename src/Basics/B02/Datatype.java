package Basics.B02;

public class Datatype {
    public static void main(String[] args){
//      Numeric datatype byte, short, int, long
        byte num1 = 127;
        System.out.println(num1);

        short num2 = 5000;
        System.out.println(num2);

        int num3 = 500002222;
        System.out.println(num3);

        long num4 = 1277412387;
        System.out.println(num4);

//      float, double
        float num5 = 127.12351f;
        System.out.println(num5);

        double num6 = 127.12351121212121;
        System.out.println(num6);

//      Boolean
        boolean bool = true;
        System.out.println(bool);

//      Char
        char character = 'a' ;
        System.out.println("My first Char is: " + character);

        char character1 = 'a' + 2 ;
        System.out.println("My first Char with ASCII addition is: " + character1);

        char character2 = 'a';
        System.out.println("My first Char with ASCII addition is: " + (character2 + 2));

//      Explicit Conversion
        char character3 = 'a';
        System.out.println("My first Char with ASCII addition is: " + (char)(character3 + 2));


    }
}

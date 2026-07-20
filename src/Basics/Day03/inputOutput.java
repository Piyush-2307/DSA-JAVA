package Basics.Day03;

import java.math.BigInteger;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int firstnum = sc.nextInt();
        System.out.print("Enter the second num: ");
        int secondnum = sc.nextInt();
        int ans = firstnum + secondnum;
        System.out.println("Total: " + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("Big Integer: " + bg);

        System.out.println("Enter the val of the flag: ");
        Boolean bl = sc.nextBoolean();

        System.out.println("Enter the short val: ");
        short sh = sc.nextShort();

        System.out.println("Enter the float val: ");
        float fl = sc.nextFloat();

        System.out.println("this is the flag val: " + bl);
        System.out.println("this is the short val:" + sh);
        System.out.println("this is the float val:" + fl);

        sc.close();
    }
}

package Basics.Day03;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user:" + sc);
        int firstUser = sc.next();
        System.out.println("Enter the name of the second user:" + sc);
        int SecondUser = sc.next();
    }
}

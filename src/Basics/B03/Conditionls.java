package Basics.B03;

import java.util.Scanner;

public class Conditionls {
    public static void main(String[] args) {

//      if-else
        int age = 19;
        if(age > 18){
            System.out.println("can vote: " + age);
        }else if (age == 18) {
            System.out.println("can vote: " + age);
        }else{
            System.out.println("can not vote: " + age);
        }

//      if-else-if ladder
        int accquracy = 78;

        if(accquracy >= 90){
            System.out.println("Excellent: " + accquracy);
        }else if (accquracy >= 75) {
            System.out.println("Good: " + accquracy);
        }else if(accquracy >= 60){
            System.out.println("Avg: " + accquracy);
        }else {
            System.out.println("Need improvement");
        }

//      Nested
        Boolean hasSub = true;
        int  solvedProblems = 220;

        if(hasSub){
            if (solvedProblems >= 200){
                System.out.println("Unlock Advance sheet");
            }else {
                System.out.println("solve more problems");
            }
        }else {
            System.out.println("Upgrade the plan");
        }

//      Ternery
        int ep = 6;
        String status = (ep < 12) ? "Still going on: " + ep : "All ep completed: " + ep;
        System.out.println(status);

//      Switch
        System.out.println("Enter the date:");
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();

        switch (date){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Sun");
        }

//      HW
        System.out.println("Enter the marks:");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks:");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks:");
        int marks3 = sc.nextInt();
        System.out.println("Enter the marks:");
        int marks4 = sc.nextInt();
        System.out.println("Enter the marks:");
        int marks5 = sc.nextInt();

//      store and compute
        int min = 0;

        if((marks1 < marks2) && (marks1 < marks3) && (marks1 < marks4) && (marks1 < marks5)){
//            System.out.println("1 is lowest: " + marks1);
            min = marks1;
        }
        else if ((marks2 < marks1) && (marks2 < marks3) && (marks2 < marks4) && (marks2 < marks5)) {
//            System.out.println("2 is lowest: " + marks2);
            min = marks2;
        }
        else if ((marks3 < marks1) && (marks3 < marks2) && (marks3 < marks4) && (marks3 < marks5)) {
//            System.out.println("3 is lowest: " + marks3);
            min = marks3;
        }
        else if ((marks4 < marks1) && (marks4 < marks2) && (marks4 < marks3) && (marks4 < marks5)) {
//            System.out.println("4 is lowest: " + marks4);
            min = marks4;
        }
        else if ((marks5 < marks1) && (marks5 < marks2) && (marks5 < marks3) && (marks5 < marks4)) {
            System.out.println("5 is lowest: " + marks5);
            min = marks5;
        }
        System.out.println("The lowest num is: " + min);

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("the total is: " + total);

        int drop = total - min;
        System.out.println("The drop marks is: " + drop);

        float percentage = (drop / 500f) * 100;
        System.out.println("the percentage is: " + percentage);


        System.out.print("Enter your string: ");
        String str = sc.next();
        if(str == str.toLowerCase()){
            System.out.println(str.toUpperCase());
        } else if (str == str.toUpperCase()) {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
}

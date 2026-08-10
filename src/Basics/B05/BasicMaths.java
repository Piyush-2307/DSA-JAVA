package Basics.B05;

import java.util.Scanner;

public class BasicMaths {
    static int printAllNum(int num){
        while (num != 0){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
        return num;
    }
    static int countAllNum(int num){
        int count = 0;
        while (num != 0){
            int digit = num % 10;
            System.out.println(digit);
            count++;
//            System.out.println(count);
            num = num / 10;
        }
        return count;
    }
    static int sumAllNum(int num){
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
//            System.out.println(digit);
            sum = sum + digit;
//            System.out.println(count);
            num = num / 10;
        }
        return sum;
    }

    static int reverseNum(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    static boolean PrimeNum(int primeIp){
        if (primeIp < 1){
            System.out.println(primeIp + " num is less than 1");
            return false;
        }else {
            for (int i = 2; i * i <= primeIp; i++) { //O(n) time complexity
                if (primeIp % i == 0){
                    System.out.println(primeIp + " it is not a prime num");
                    return false;
                }
            }
        }
        System.out.println(primeIp + " it is a prime num");
        return true;
    }

    static int getGCD(int a, int b){
        while (b != 0){
            int oldVal = b;
            b = a % b;
            a = oldVal;
        }
        return a;
    }

    static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    static int getArm(int arms){
        int val = 0;
        int ogNum = arms;
        while (arms != 0){
            int digit = arms % 10;
            int cubeOfDigit = digit * digit * digit;
//            System.out.println(cubeOfDigit);
            val = val + cubeOfDigit;
            arms = arms / 10;
        }
        if (val == ogNum){
            System.out.println(val + " it is a armstrong num");
        }else {
            System.out.println(val + " it is not a armstrong num");
        }
        return val;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arms = sc.nextInt();
//        getArm(arms);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(getGCD(a,b));
//        System.out.println(getLCM(a,b));
//        int num = 8762;
//        int primeIp = sc.nextInt();
//        System.out.println(PrimeNum(primeIp));
//        int revNum = reverseNum(num);
//        System.out.println("Reverse num is: " + revNum);
//        if (num == revNum){
//            System.out.println(num + ", " + revNum + " is palindrome");
//        }else {
//            System.out.println(num + ", " + revNum + " is not palindrome");
//        }
//        int total = sumAllNum(num);
//        System.out.println("Sum of the num is: " + total);
//        int ans =countAllNum(num);
//        System.out.println("total digits are: " + ans);
//        printAllNum(num);


    }

}

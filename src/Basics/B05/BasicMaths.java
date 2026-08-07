package Basics.B05;

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

    public static void main(String[] args) {
        int num = 8762;
        int revNum = reverseNum(num);
        System.out.println("Reverse num is: " + revNum);
//        int total = sumAllNum(num);
//        System.out.println("Sum of the num is: " + total);
//        int ans =countAllNum(num);
//        System.out.println("total digits are: " + ans);
        printAllNum(num);
    }

}

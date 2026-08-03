package Basics.B05;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //declaration
        int[] arr;
        //allocation
        int[] arr1 = new int[9];
        //initialization
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

//        System.out.println("Value of 2nd index is the third value: " + arr2[2]);

//        int n = arr2.length;
//        for (int index = 0; index <= n - 1; index++){
//            System.out.println(arr2[index]);
//        }

//      For each
//        for (int i : arr2){
//            System.out.println(i);
//        }

        Scanner sc= new Scanner(System.in);
        int[] arr3 = new int[5];
        int sum = 0;
        for (int i = 0; i < arr3.length; i++){
            System.out.print("Give me the val " + i + ": ");
            arr3[i] = sc.nextInt();
            int val = arr3[i];
            sum = sum + val;
            System.out.println(sum);
        }
//        for (int val : arr3){
//            System.out.println("Val is this: " + val);
//        }
    }
}

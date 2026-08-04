package Basics.B05;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //declaration
        int[] arr;
        //allocation
        int[] arr1 = new int[9];
        //initialization
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        System.out.println("Value of 2nd index is the third value: " + arr2[2]);

        int n = arr2.length;
        for (int index = 0; index <= n - 1; index++){
            System.out.println(arr2[index]);
        }

//      For each
        for (int i : arr2){
            System.out.println(i);
        }

        int[] arr3 = new int[3];
        int sum = 1;
        for (int i = 0; i < arr3.length; i++){
            System.out.print("Give me the val " + (i + 1) + ": ");
            arr3[i] = sc.nextInt();
            int val = arr3[i];
            sum = sum * val;
        }
            System.out.println("Total val is: " + sum);

        for (int val : arr3){
            System.out.println("Val is this: " + val);
        }

        int[] arr4 = {4,6,2,8,5};
        int max = arr4[0];
        for (int i = 1; i < arr4.length; i++){
            if (max >= arr4[i]){
                max = arr4[i];
            }
        }
        System.out.println(max);

//        2D array

        //declaration
          int[][] ar;
        //allocation
          ar = new int[3][4];
        //initialization
        int[][] brr = {
                {1,2},
                {3,4,5,6},
                {7,8,9,10,11,12},
                {13}
        };
        System.out.println(brr[2][2]);
//        int rowlength = brr.length;
//        int collength = brr[0].length;
        for (int row = 0; row < brr.length; row++){
            for (int col = 0; col < brr[row].length ; col++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }

        int[][] array = new int[3][3];
        int sum1 = 0;
        int maxNum = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print("Input " + (col + 1) + ": ");
              array[row][col] = sc.nextInt();
                if (array[row][col] >= maxNum)
                    maxNum = array[row][col];
            }
            }
                System.out.println("Max num is: " + maxNum);
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    int value = array[row][col];
                    sum1 = sum1 + value;
                }
            System.out.println();
        }
                    System.out.println("total: " + sum1);

    }
}

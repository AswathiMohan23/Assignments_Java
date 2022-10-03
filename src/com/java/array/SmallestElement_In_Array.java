package com.java.array;

import java.util.Scanner;

// 3) code to print the smallest element in an array
//   ===================================================

public class SmallestElement_In_Array {
    public static void main(String args[]) {
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] inputArray = new int[size];    //Syntax of arrays
        System.out.println("Enter the elements :");
        for (int i = 0; i < size; i++)
            inputArray[i] = sc.nextInt();
        int smallest = inputArray[0];
        for (int i = 0; i < size; i++) {//inputArray) {
            if (smallest > inputArray[i])       //comparing the elements
                smallest = inputArray[i];
        }
        System.out.println("the smallest array element is : " + smallest);

    }
}

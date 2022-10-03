package com.java.array;

import java.util.Scanner;

// 3) Java Program to print the largest element in an array
//   =====================================================

public class LargestElement_In_Array {
    public static void main(String args[]) {
        System.out.println("Enter the size of the array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []inputArray=new int[size];    //Syntax of arrays
        System.out.println("Enter the elements :");
        for(int i=0; i<size; i++ )
            inputArray[i] = sc.nextInt();
        int largest = inputArray[0];
        for (int i = 0; i < size; i++) {//inputArray) {
            if (largest < inputArray[i])       //comparing the elements
                largest = inputArray[i];
        }
        System.out.println("the largest array element is : "+largest);

        }
}

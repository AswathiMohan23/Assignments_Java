package com.java.array;
import java.util.Scanner;

// Find 2nd Largest Number in an Array
// ===================================

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        int output[] = new int[size];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        int number = 0;
        //Sort the array in descending order
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    number = input[j];
                    input[j] = input[i];
                    input[i] = number;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\nthe second largest no is : "+input[1]);
    }// input[1] means second no as for array, index starts from 0
}
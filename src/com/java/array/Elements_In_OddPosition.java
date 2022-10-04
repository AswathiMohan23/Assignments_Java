package com.java.array;

import java.util.Scanner;

//Java Program to print the elements of an array present on odd position
//======================================================================

public class Elements_In_OddPosition {
    public static void main(String[] args) {
        System.out.println("enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int inputArray[] = new int[size];
        System.out.println("enter the elements : ");
        for (int i = 0; i < size; i++) {
            inputArray[i] = sc.nextInt();
        }
        int odd[] = new int[size];
        System.out.println("the elements in the odd positions are : ");
        for (int j = 1; j < size; j = j+2) {
            System.out.println("odd position " + j + " : element = " + inputArray[j]);
            }
        }
    }


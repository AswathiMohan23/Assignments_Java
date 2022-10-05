package com.java;

import java.util.Scanner;

public class Sum_And_Count_InvalidIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int firstNo=sc.nextInt();
        System.out.println("enter the second number : ");
        int secondNo=sc.nextInt();
        if((firstNo ==(int)firstNo) && (secondNo == (int)secondNo)) {
            int sum = firstNo + secondNo;
            System.out.println("the sum is  : " + sum);
        } else if ((firstNo!=(int)firstNo)&&(secondNo==(int)secondNo)) {
            System.out.println("first no is invalid");
        } else if ((firstNo==(int)firstNo)&&(secondNo!=(int)secondNo)) {
            System.out.println("second no is invalid");
        }else {
            System.out.println("Both nos are invalid");
        }
    }
}

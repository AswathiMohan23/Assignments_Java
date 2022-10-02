package com.java.if_else_statements;

import java.util.Scanner;

//Read a single Digit Number and write in word using if else
//===========================================================

public class Input_As_No_And_Write_In_Words {
    public static void main(String[] args){
        System.out.println("Enter a no between 0 to 10 : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number==1)
            System.out.println("1 = one");
        else if (number==2)
            System.out.println("2 = two");
        else if (number==3)
            System.out.println("3 = three");
        else if (number==4)
            System.out.println("4 = four");
        else if (number==5)
            System.out.println("5 = five");
        else if (number==6)
            System.out.println("6 = six");
        else if (number==7)
            System.out.println("7 = seven");
        else if (number==8)
            System.out.println("8 = eight");
        else if (number==9)
            System.out.println("9 = nine");
        else
            System.out.println("Sorry wrong entry !!!!! try again by entering a number between 0 and 10...");
        }
}

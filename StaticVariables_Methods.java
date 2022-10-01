package com.java;

public class StaticVariables_Methods {
    static int a = 3; // Declaration of Static Variable
    static int b = 4; // Declaration of Static Variable
    static int addition (int a, int b) // Declaring a Static Method
    {
        int sum = a + b;
        return sum;
    }
    static // Declaring Static Block
    {
        System.out.println("Initialising static block ==> step 1");
        // static block executed first because JVM know static block only
        // and start executing each of them. Executed in the order of their declaration.
    }
    public static void main(String[] args) {
        System.out.println("The sum of the two nos are " +addition(a , b));
    }
}


package com.java.array;

import java.util.Arrays;

//Java Program to find the frequency (repetition) of each element in the array
//===============================================================

public class Frequency_Of_An_Element {
    public static void main(String[] args){
        int inputArray[]={1,9,3,4,5,6,5,9,5};
        int frequency[]=new int[inputArray.length];
        Arrays.fill(frequency,1);// sets all elements in the array to -1 ,ie, fill the array with 1
        CountFrequency(inputArray,frequency);
    }
    static void CountFrequency(int arr[], int frequency[]){
        int count;
        for(int i=0; i<arr.length; i++){
            count =1; // Resets count to 1 after each element
            for(int j =i+1;j<arr.length;j++){ // taken as j+1 because we need to check from second element which is at arr[1]
                                                // If another occurence of the current element is found
                                                 // in the array then increments the counter
                if(arr[i]==arr[j])
                {
                    count++;
                    frequency[j] = 0;
                }
            }
            // Stores the frequency of each element
            if(frequency[i]!=0)
            {
                frequency[i] = count;
            }
        }

        // Prints the elements with their occurences
        System.out.println("The elements and their occurences are");
        for(int i = 0; i<arr.length;i++)
        {
            if(frequency[i]>=1)
                System.out.println("Element "+arr[i]+" has occured "+frequency[i]+" times.");
        }
    }
}


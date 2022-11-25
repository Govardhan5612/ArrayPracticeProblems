package com.bridgelabz;

/**
 * @GovardhanReddy
 */

public class SmallestElementOfArray {
    /**
     *Find smallest element of array
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,0};
        int smallestElement = array[0];
        for (int i = 0;i<array.length;i++){
           if (array[i]<smallestElement){
               smallestElement=array[i];

           }
        }
        System.out.println("Smallest element of array is "+smallestElement);

    }
}

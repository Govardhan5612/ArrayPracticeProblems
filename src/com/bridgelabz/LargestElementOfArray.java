package com.bridgelabz;

/**
 * @GovardhanReddy
 */

public class LargestElementOfArray {
    /**
     *Find the largest element of the array
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,8,9,6};
        int largestElement = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>largestElement){
                largestElement = array[i];
            }
        }

        System.out.println("Largest element of array is "+largestElement);

    }
}

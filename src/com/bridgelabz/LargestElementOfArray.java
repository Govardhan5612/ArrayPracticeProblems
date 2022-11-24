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
        int duplicateElement = array[0];
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                    duplicateElement=array[i];
                    array[i]=array[j];
                    array[j]=duplicateElement;
                }
            }
        }

        System.out.println("Largest element of array is "+array[0]);

    }
}

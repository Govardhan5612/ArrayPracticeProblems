package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class SecondLargestElementOfArray {
    /**
     *find the second largest and smallest elements of array
     */
    public static void main(String[] args) {
        int [] array = {10,22,42,65,85,95,84,87,68};
        int duplicateValue;
        for (int i =0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                    duplicateValue=array[i];
                    array[i]=array[j];
                    array[j]=duplicateValue;
                }
            }
        }
        System.out.println("Second largest element of array is "+array[1]);
        System.out.println("Second smallest element od array is "+array[array.length-2]);

    }
}

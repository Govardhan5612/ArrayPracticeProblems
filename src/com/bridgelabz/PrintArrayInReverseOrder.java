package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class PrintArrayInReverseOrder {
    /**
     *Print Array in reverse order
     */
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.print("Array in reverse order :");
        for (int i =array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}

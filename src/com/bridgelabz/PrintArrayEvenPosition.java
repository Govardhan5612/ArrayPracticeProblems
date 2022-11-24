package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class PrintArrayEvenPosition {
    /**
     * print even elements in array
     */
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.print("Print even position elements : ");
        for (int i=0;i<array.length;i++){
            if (i%2==0){
                System.out.print(array[i]+" ");
            }
        }
    }
}

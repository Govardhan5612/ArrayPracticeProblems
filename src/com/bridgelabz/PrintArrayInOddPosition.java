package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class PrintArrayInOddPosition {
    /**
     *print array elements in odd position
     */
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0;i<array.length;i++){
            if (i%2!=0){
                System.out.print(array[i]+" ");
            }
        }

    }
}

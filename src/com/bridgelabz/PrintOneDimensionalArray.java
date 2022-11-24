package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class PrintOneDimensionalArray {
    /**
     * Print One dimensional array
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int lengthOfArray = input.nextInt();
        int [] array = new int[lengthOfArray];
        System.out.println("Enter the values of Array : ");
        for (int i = 0;i <lengthOfArray;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            array[i]=input.nextInt();
        }
        System.out.print("Values of array - ");
        for (int j =0;j<lengthOfArray;j++){
            System.out.print(array[j]+" ");
        }
        input.close();
    }
}

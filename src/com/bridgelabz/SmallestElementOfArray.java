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
        int duplicateelement = array[0];
        for (int i = 0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    duplicateelement=array[i];
                    array[i]=array[j];
                    array[j]=duplicateelement;
                }
            }
        }
        System.out.println("Smallest element of array is "+array[0]);

    }
}

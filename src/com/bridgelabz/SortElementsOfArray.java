package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class SortElementsOfArray {
    /**
     *Sorting the elements of Array
     */
    public static void main(String[] args) {
        int [] array = {0,9,8,4,5,3,5,1,2};
        int duplicateElement = array[0];
        for (int i=0;i<array.length;i++){
            for (int j =i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    duplicateElement=array[i];
                    array[i]=array[j];
                    array[j]=duplicateElement;
                }
            }
        }
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}

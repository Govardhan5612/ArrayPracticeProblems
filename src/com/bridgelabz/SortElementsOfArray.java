package com.bridgelabz;

/**
 * @GovardhanReddy
 */
public class SortElementsOfArray {
    /**
     *Sorting the elements of Array
     */
    public static void main(String[] args) {
        int [] array = {10,9,8,7,6,5,8,1};
        int duplicateElement;
        for (int i=0;i<array.length;i++){
            for (int j =i;j<array.length;j++){
                if (array[i]>array[j]){
                    duplicateElement=array[i];
                    array[i]=array[j];
                    array[j]=duplicateElement;
                }
            }
        }
        System.out.println("Array elements in ascending order : ");
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}

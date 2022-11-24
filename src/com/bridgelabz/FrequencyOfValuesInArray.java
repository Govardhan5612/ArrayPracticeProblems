package com.bridgelabz;

import java.lang.reflect.Array;

/**
 * @GovardhanReddy
 */

public class FrequencyOfValuesInArray {
    /**
     *find frequency elements of array
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,1,2};


        for (int i=0;i<array.length;i++){
            int count = 0;
            for (int j =0;j<array.length;j++){
                if (array[j]==array[i]){
                    count++;
                }
            }
            System.out.println(array[i]+" --> "+count);
        }


    }
}

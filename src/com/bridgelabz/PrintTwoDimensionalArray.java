package com.bridgelabz;

import javax.script.ScriptContext;
import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class PrintTwoDimensionalArray {
    /**
     * Print multi dimensional array
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = input.nextInt();
        int [][] array = new int[rows][columns];
        for (int i =0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("Enter " +(i)+""+(j)+" value : " );
                array[i][j]=input.nextInt();

            }
        }

        for (int i =0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        input.close();

    }
}

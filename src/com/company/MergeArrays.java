package com.company;

import java.util.ArrayList;


public class MergeArrays {

    public void mergeArrays(int[] Array, ArrayList mergedArray) {

        for (int i = 0; i < Array.length; i++) {
            mergedArray.add(Array[i]);

        }
    }

    public void sortArray(Integer[] mergedSimpleArray) {
        int temp;
        for (int i = 1; i < mergedSimpleArray.length; i++) {
            int j = i;
            while (j > 0 && mergedSimpleArray[j - 1] > mergedSimpleArray[j]) {
                //swapping
                temp = mergedSimpleArray[j];
                mergedSimpleArray[j] = mergedSimpleArray[j - 1];
                mergedSimpleArray[j - 1] = temp;
                //j-- is for comparing all right side
                j--;
            }

        }printArray(mergedSimpleArray);
    }

    public static void printArray(Integer[] input_array){
        for(int i=0; i < input_array.length; i++)
            System.out.print(input_array[i] + " ");
    }
}
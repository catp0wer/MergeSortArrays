package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 5, 5};
        int[] secondArray = {2, 6, 7};
        int[] thirdArray = {1, 4, 7, 8,2};

        ArrayList<Integer> mergedArray = new ArrayList<Integer>();

        MergeArrays my_array = new MergeArrays();

        my_array.mergeArrays(firstArray, mergedArray);
        my_array.mergeArrays(secondArray, mergedArray);
        my_array.mergeArrays(thirdArray, mergedArray);
        System.out.println("merged array "+mergedArray);
        //converting ArrayList to Array
        Integer [] mergedSimpleArray = mergedArray.toArray(new Integer [mergedArray.size()]);

        my_array.sortArray(mergedSimpleArray);


    }
}

package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 5, 5};
        int[] secondArray = {2, 6, 7};
        int[] thirdArray = {1, 4, 7, 8};

        ArrayList<Integer> mergedArray = new ArrayList<>();

        MergeArrays my_array = new MergeArrays();


        my_array.mergeArrays(firstArray, mergedArray);
        my_array.mergeArrays(secondArray, mergedArray);
        my_array.mergeArrays(thirdArray, mergedArray);
        System.out.println(mergedArray);

    }
}

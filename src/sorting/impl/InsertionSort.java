package sorting.impl;

import sorting.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort implements SortingAlgorithms {

    public void sort(int[] intArr){
        printArr(intArr, " array before sorting ");
        for (int j = 0; j < intArr.length; j++) {
            int temp = intArr[j];
            int i = j;
            while (i > 0 && temp < intArr[i-1]) {

                intArr[i] = intArr[i - 1];
                i--;
            }
            intArr[i] = temp;
        }

        printArr(intArr, " array after sorting ");
    }


}

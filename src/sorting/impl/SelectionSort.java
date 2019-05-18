package sorting.impl;

import sorting.SortingAlgorithms;

public class SelectionSort implements SortingAlgorithms {

    @Override
    public void sort(int[] arr){
        int min_index = 0;
        for(int i = 0 ; i < arr.length; i++){
            min_index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}

package sorting.impl;

import sorting.SortingAlgorithms;

public class QuickSort implements SortingAlgorithms{
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int low, int high){

        if(low < high) {

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }

    private int partition(int[] arr, int low, int high){
        int i = low -1;
        int temp;
        for(int j = low; j <= high-1; j++){
            if(arr[j]< arr[high]){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}

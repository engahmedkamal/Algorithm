package sorting.impl;

import sorting.SortingAlgorithms;

public class HeapSort implements SortingAlgorithms {
    @Override
    public void sort(int[] arr) {
        int lastNonLeafNode = (arr.length / 2) - 1;
        for (int i = lastNonLeafNode; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }


    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = (2 * i) + 1;
        int r = (2 * i) + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (i != largest) {
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

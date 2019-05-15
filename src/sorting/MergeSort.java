package sorting;

public class MergeSort {

    public void sort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            arr2[i - mid] = arr[i];
        }

        sort(arr1);
        sort(arr2);

        merge(arr, arr1, arr2);
    }

    private void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }
    }
}

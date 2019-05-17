package sorting;

import sorting.impl.BubbleSort;
import sorting.impl.HeapSort;
import sorting.impl.InsertionSort;
import sorting.impl.MergeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array of int space separated");
        String arrayString = br.readLine();
        int[] intArr = Stream.of(arrayString.split(" ")).mapToInt(Integer::parseInt).toArray();
        SortingAlgorithms insertionSort = new InsertionSort();
        SortingAlgorithms bubbleSort = new BubbleSort();
        SortingAlgorithms heapSort = new HeapSort();
        SortingAlgorithms mergeSort = new MergeSort();
        List<SortingAlgorithms> sortingAlgorithmsList = addSortingAlgo(heapSort,insertionSort, bubbleSort,mergeSort);

        for (SortingAlgorithms sortalgo : sortingAlgorithmsList) {
            sortalgo.printArr(intArr, "array before sorting ");
            int[] copyarray= Arrays.copyOf(intArr, intArr.length) ;
            sortalgo.sort(copyarray);
            sortalgo.printArr(copyarray, "array after sorting using "+ sortalgo.getClass().getName());
        }

    }

    private static List<SortingAlgorithms> addSortingAlgo(SortingAlgorithms... sortingAlgorithms) {
        List<SortingAlgorithms> sortingAlgorithmsList = new ArrayList<>();
        sortingAlgorithmsList.addAll(Arrays.asList(sortingAlgorithms));
        return sortingAlgorithmsList;
    }
}

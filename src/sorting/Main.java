package sorting;

import sorting.impl.BubbleSort;
import sorting.impl.InsertionSort;

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
        List<SortingAlgorithms> sortingAlgorithmsList = addSortingAlgo(insertionSort, bubbleSort);

        for (SortingAlgorithms sortalgo : sortingAlgorithmsList) {
            sortalgo.sort(intArr);
        }

    }

    private static List<SortingAlgorithms> addSortingAlgo(SortingAlgorithms... sortingAlgorithms) {
        List<SortingAlgorithms> sortingAlgorithmsList = new ArrayList<>();
        sortingAlgorithmsList.addAll(Arrays.asList(sortingAlgorithms));
        return sortingAlgorithmsList;
    }
}

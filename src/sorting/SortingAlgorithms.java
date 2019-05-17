package sorting;

public interface SortingAlgorithms {

    void sort(int[] arr);

    default void printArr(int[] intArr, String msg){
        System.out.print(msg+" ");
        for (int m:intArr) {
            System.out.print(m +" ");
        }
        System.out.println(" ");

    }

}

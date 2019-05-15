package sorting;

public class BubbleSort {
    public void sort(int arry[]) {
        for (int i = 0; i < arry.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arry.length - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}

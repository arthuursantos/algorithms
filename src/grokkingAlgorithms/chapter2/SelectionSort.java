package grokkingAlgorithms.chapter2;

import java.util.Arrays;

public class SelectionSort {

    public static int findBiggestValue(int[] array, int i) {
        int bIndex = i;
        for (int j = i+1; j < array.length; j++) {
            if (array[j] > array[bIndex]) {
                bIndex = j;
            }
        }
        return bIndex;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int bIndex = findBiggestValue(array, i);
            int bValue = array[bIndex];
            for (int k = bIndex; k > i; k--) {
                array[k] = array[k-1];
            }
            array[i] = bValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] orderedArray = selectionSort(new int[]{1, 12, 32, 96, 10, 6, 0});
        System.out.println(Arrays.toString(orderedArray));
    }
}

package introductionToAlgorithms.chapter2;

import java.util.Arrays;

public class e231 {

    public static int[] sort(int[] array) {

        if (array.length<2) {
            return array;
        }

        int cut = array.length / 2;
        int[] left = new int[cut];
        int[] right = new int[array.length - cut];

        int j = 0, k = 0;
        for (int i = 0; i<array.length;i++) {
            if (i<cut) {
                left[j++] = array[i];
            } else {
                right[k++] = array[i];
            }
        }

        sort(left);
        sort(right);
        merge(array, left, right);

        return array;
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (j<left.length && k<right.length) {
            if (left[j] < right[k]) {
                array[i++] = left[j++];
            } else {
                array[i++] = right[k++];
            }
        }

        while (j < left.length) {
            array[i++] = left[j++];
        }
        while (k < right.length) {
            array[i++] = right[k++];
        }

    }


    public static void main(String[] args) {
        int[] array = {38};
        sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
package introductionToAlgorithms.chapter2;

import java.util.ArrayList;
import java.util.List;

// 2.1-2 Reescreva o procedimento Insertion-Sort para ordenar em ordem não crescente, em vez da ordem não
// decrescente.

public class e212 {

    public static List<Integer> insertionSort(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            Integer key = nums.get(i);
            int j = i - 1;
            while (j >= 0 && nums.get(j) < key) {
                nums.set(j+1, nums.get(j));
                j--;
            }
            nums.set(j+1, key);
        }
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(12, 43, 21, 5, 98, 27, 13, 2));
        System.out.println(insertionSort(nums));
    }

}

package arrays;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {9, 9, 2, 8, 8, 8, 0, 3, 7, 4, 4, 4, 6, 5, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }
        }
    }
}

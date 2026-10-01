package arrays;

import java.util.Arrays;

public class ArraysSort {
    static void main(String[] args) {
        int[] c = {1, 0, 9, 8, 7, 6, 5, 4, 3, 2};
        sort(c);
        System.out.println(Arrays.toString(c));
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

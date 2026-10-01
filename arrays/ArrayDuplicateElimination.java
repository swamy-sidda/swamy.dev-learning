package arrays;

import java.util.Arrays;

public class ArrayDuplicateElimination {
    static void main() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 19, 19, 19};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 17};
        System.out.println(Arrays.toString(returnArray(a, b)));
    }

    static int[] returnArray(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        if (array[0] == 0) {
            if (arr1[i] <= arr2[j]) {
                array[k++] = arr1[i++];
            } else {
                array[k++] = arr2[j++];
            }
        }
        int t = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (array[t] < arr1[i]) {
                    array[k++] = arr1[i];
                    t++;
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (array[t] < arr2[j]) {
                    array[k++] = arr2[j];
                    t++;
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (array[t] < arr1[i]) {
                array[k++] = arr1[i];
                t++;
            }
            i++;
        }
        while (j < arr2.length) {
            if (array[t] < arr2[j]) {
                t++;
                array[k++] = arr2[j];
            }
            j++;
        }
        int count = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        for (i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}

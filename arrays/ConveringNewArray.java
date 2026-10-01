package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ConveringNewArray {
    static void main(String[] args) {
        String[] a = {"S", "B", "C", "D", "F"};
        String[] b = {"S", "B", "C", "D", "F"};
        String[] arr = copyElements(a, b);
        System.out.println(Arrays.toString(arr));
    }

    public static String[] copyElements(String[] arr, String[] arr1) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            list.add(arr[i]);

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

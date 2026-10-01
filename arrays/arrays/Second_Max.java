package arrays.arrays;

import java.util.Arrays;

class Second_Max {
    public static void main(String fa[]) {
        int[] a = {10, 3, 4, 6, 7, 89, 4, 2, 6, 7, 8};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[i + 1]) continue;
            count++;
            if (count == 1)
                System.out.println(a[i + 1]);
            break;
        }
        System.out.println(Arrays.toString(a));
    }
}
package arrays;

public class ArrayIteration4 {
    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {5, 6, 7, 8, 9};
        int[] c = {1, 2, 3, 4, 7, 8, 9};
        arrayIteration(a, b, c);
    }

    public static void arrayIteration(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            } else if (a[i] > b[j]) {
                j++;
            } else if (b[j] > c[k]) {
                k++;
            } else {
                i++;
            }
        }
        System.out.println();
        System.out.println("process completed successfully");
    }
}

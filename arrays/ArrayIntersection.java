package arrays;

public class ArrayIntersection {
    static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {5, 6, 7, 8, 9};
        int[] c = {1, 2, 3, 4, 7, 8, 9};
        arrayIterator(a, b, c);
    }

    public static void arrayIterator(int[] a, int[] b, int[] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    if (a[i] == b[j] && b[j] == c[k]) {
                        System.out.print(a[i] + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("process completed successfully");
    }
}


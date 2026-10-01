package arrays;

public class ArrayDuplicates {
    static void main(String[] args) {
        int count = -1;
        int[] original = {9, 9, 9, 1, 1, 2, 2, 3, 3, 4, 5};
        int[] copy = new int[original.length];
        int k = 0;
        copy[k++] = original[0];
        for (int i = 1; i < original.length; i++) {
            boolean flag = true;
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (original[j] == original[index]) {
                    flag = false;
                    break;
                }
            }
            if (flag) copy[k++] = original[index];
        }
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != 0) {
                System.out.print(copy[i] + " ");
            }
        }
    }
}

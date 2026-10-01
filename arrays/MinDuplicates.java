package arrays;


public class MinDuplicates {
    static void main(String[] args) {
        Integer[] arr = {-1, -3, 10, 13, 14, 0, 0, 0, 1, 2, 3, 4, -2, -3, -4,};
        System.out.println(minDuplicates(arr));
    }

    public static Integer minDuplicates(Integer[] arr) {
        int diff = Integer.MAX_VALUE;
        Integer res;
        int min = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) continue;
            if (arr[i] >= 0 && arr[i] < min) min = arr[i];
            res = arr[i] - min;
            System.out.println(min + " " + res);
            if (res >= 0 && res < diff) diff = res;
        }
        if (diff >= 0 && diff != Integer.MAX_VALUE) return diff;
        return null;
    }
}

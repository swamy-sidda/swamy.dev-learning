package arrays;

public class MissingNumber {
    static void main() {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        System.out.println("missing number is " + sum);
    }
}

package arrays;

public class MaximumSubArraySum {
    static void main() {
        int[] arr = {1, 2, 3, -1, 9};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int value = 0;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
            if (sum > value) {
                value = sum;
            }
            if (nums[index] < 0) {
                sum = 0;
            }
        }
        return value;
    }
}

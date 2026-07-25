package arrays;

import java.util.Arrays;

public class ThreeSumClosset {
    static void main() {
        int[] arr = {5,6,7,8,9,0,1,2,3,4,5,6,7,8};
        System.out.println( threeSumClosest(arr,4));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return (target - diff);
    }
}


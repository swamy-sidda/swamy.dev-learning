package arrays;

public class MaxDifference {
    static void main(String[] args) {
        int[] nums = {9, 9, 8, 12, 45};
        System.out.println(maxDifference(nums));
    }

    public static Integer maxDifference(int[] nums) {
        int diff = 0;
        int res = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > min) res = nums[i] - min;
            if (res > diff) diff = res;
        }
        if (diff > 0) return diff;
        return null;
    }
}

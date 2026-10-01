package arrays.arrays;

public class PreviousAndNextSum {
    static void main() {
        int[] n={1,2};
        getSum(n);
    }
    public static void getSum(int[] nums) {
        if(nums==null || nums.length<=1) return;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (i < nums.length -1) {
                System.out.print(nums[i-1]+nums[i+1]);
                System.out.print(" ");
            }
            else {
                System.out.print(nums[i-1]);
            }
        }
        System.out.println();
    }
}

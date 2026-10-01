package arrays;

public class Max_Sum {
    static void main(String[] args) {
        int a[] = {1, 2, -3, 6, -3};
        int sum = 0;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i];
            if (sum < res) {
                sum = res;
            }
        }
        System.out.println(sum);
    }
}

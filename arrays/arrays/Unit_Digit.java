package arrays.arrays;

class Unit_Digit {
    static int res = 0;

    public static void main(String af[]) {
        int[] a = {10, 20};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum(sum));
    }

    public static int sum(int n) {
        if (n <= 9) return n;
        while (n != 0) {
            int rem = n % 10;
            res += rem;
            n /= 10;
        }
        return sum(res);
    }
}
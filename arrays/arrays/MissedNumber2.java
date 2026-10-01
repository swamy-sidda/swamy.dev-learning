package arrays.arrays;

public class MissedNumber2 {
    static void main() {
        int[] arr = {0,1,2, 3, 4, 5, 6, 7, 8, 10};
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) max=arr[i];
        }
        int sum=0;
        int total=0;
        for(int i=0;i<=max;i++) {
            if(i<arr.length) sum+=arr[i];
            total+=i;
        }
        System.out.println("The missed number is "+(total-sum));
    }
}

package arrays;

public class MaximumDifference {
    static void main() {
        int[] arr={1,2,3,1,9};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int j=arr.length-1;
        for(int i=0;i<=j;i++){
            if(arr[j]<min){
                min=arr[j];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[j]>max){
                max=arr[j];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            j--;
        }
        return(max-min);
    }
}

package arrays;

import java.util.Arrays;

public class Rotation {
     static void main(String[] a)
        {
            int[] arr={1,11,23,44,2,3,45,65,3,4};

         arrayRotated(arr,3);
         System.out.println(Arrays.toString(arr));
        }
        int b=0;
        public static void sort(int[] arr, int start, int end)
        {
            int b=10;
            System.out.println(b);
            int i=start,j=end;
            while (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
        public static void arrayRotated(int[] arr,int n)
        {
            sort(arr, 0, arr.length-1);
            sort(arr, 0, n-1);
            sort(arr, n,arr.length-1);
        }
}

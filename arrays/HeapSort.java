package arrays;

import java.util.Arrays;

public class HeapSort {
   public  static void main(String[] args) {
       int[] arr={9,2,8,5,3,4,7,8,1,2,3,4,5,9};
       System.out.println(Arrays.toString(arr));
       heapSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr){
       int n=arr.length;
       for (int i=n/2-1;i>=0;i--){
           heapify(arr,n,i);
       }
       for (int i=n-1;i>0;i--){
           int temp=arr[0];
           arr[0]=arr[i];
           arr[i]=temp;
           heapify(arr,i,0);
       }
    }
    public static void heapify(int[] arr,int n,int i){
       int largest=i;
       int l=2*i+1;
       int r=2*i+2;
       if(l<n&&arr[l]>arr[largest]){
           largest=l;
       }
       if(r<n&&arr[r]>arr[largest]){
           largest=r;
       }
       if(largest!=i){
           int temp=arr[i];
           arr[i]=arr[largest];
           arr[largest]=temp;
           heapify(arr,n,largest);
       }
    }
}

package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SortEvenOdd {
     static void main(String[] args) {
        sortEvenOdd(new int[]{1, 3, 5, 7, 9,2,4,6,8});

    }
    public static void sortEvenOdd(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            while(arr[i]%2==0)i++;
            while(arr[j]%2==1)j++;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                ++i;
                --j;
            }
        }
        System.out.println(i);
        System.out.println(j);
     System.out.print(Arrays.toString(arr));
        int [] temp=new int[i];
        System.arraycopy(arr,0,temp,0,temp.length);
        sortEvenOdd(temp);
        int[] temp2=new int[arr.length-i];
        System.arraycopy(arr,0,temp2,0,temp.length);
        sortEvenOdd(temp2);

    }
    public static int[] sortEvenOdd2(int[] arr) {
        for(int i=0;i<arr.length;i++){
         int index=i;
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]<arr[j]){
                 index=j;
             }
             if(index!=i){
                 int temp=arr[index];
                 arr[index]=arr[j];
                 arr[j]=temp;
             }
         }
        }
        return arr;
    }
}

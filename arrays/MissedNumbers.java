package arrays;

import java.util.Arrays;

public class MissedNumbers {
     static void main(String[] as)
    {
        int[] a={1,1,3,5,4,9,12,14,16};
        iterateArray(a);
    }
    public static void iterateArray(int[] a)
    {
      Arrays.sort(a);
      for(int i=0;i<a.length-1;i++)
      {
        int ele=0;
        if(a[i]+1!=a[i+1]) {
             ele=a[i]+1;
            while(ele<a[i+1]){
                System.out.print(ele+" ");
                ++ele;
            }
        }
      }
    }
}

package twodimensional.twodarray;

import java.util.Arrays;
public class QuickSort1
{
public static void main(String ae[])
{
  int[] a={12,23,34,5,6,7,8,12,21,32,43,54,65};
  sort(a,0,a.length-1);
  System.out.println(Arrays.toString(a)); 
}
public static void sort(int[] a,int start,int end)
{
 if(start>=end) return;
 int i=start,j=end;
 int pivot=a[(start+end)/2];
 while(i<=j){
 while(a[i]<pivot) i++;
 while(a[j]>pivot) j--;
 if(i<=j)
 {
   int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
    i++;
    j--;
 }
}
 sort(a,i,end);
 sort(a,start,j);
}
}
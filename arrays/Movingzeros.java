package arrays;

import java.util.Arrays;

public class Movingzeros {
     static void main(String[] args) {
     int[] a= {1,0,1,0,1,0,1,0,1,0};
     move(a);
     System.out.println(Arrays.toString(a));
     System.out.println("Completed one");
     removeZero(a);
     System.out.println(Arrays.toString(a));
    }
    public static void move(int[] a){
      int i=0,j=a.length-1;
      for( i=0;i<j;){
          if(a[i]==0) {
              i++;
              continue;
          }
          if(a[j]==1) {
              j--;
              continue;
          }
          if(a[j]==0&&a[i]==1) {
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
              i++;
              j--;
          }

      }
        System.out.println("Completed");
    }
    public static void removeZero(int[] a){
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
    }
}

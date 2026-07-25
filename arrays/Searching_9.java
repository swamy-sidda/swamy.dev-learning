package arrays;

import java.util.Arrays;

public class Searching_9 {
    static void main() {
        int[] arr = {8,9,9,4,5,6,9,9,8};
        System.out.println(Arrays.toString(search(arr)));
    }
    public static int[] search(int[] arr) {
        int count8=0;
        int count9=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 9) count9++;
            if (arr[i] == 8) count8++;
        }
          int[] duplicateArray;
          if(count9==arr.length) {
              duplicateArray = new int[count9+1];
              duplicateArray[0] = 1;
              for(int i=1;i<arr.length;i++) {
                  duplicateArray[i]=0;
              }
          }
          else {
              duplicateArray = new int[count8 + arr.length];
              for(int i=0;i<arr.length;i++) {
                  if(arr[i]==9) duplicateArray[i]=0;
                  else if(arr[i]==8) {
                      duplicateArray[i] = 1;
                      duplicateArray[i + 1] = 0;
                      i++;
                  }
                  else duplicateArray[i] = arr[i]+1;
              }
          }

        return duplicateArray;
    }
}

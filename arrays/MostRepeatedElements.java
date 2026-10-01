package arrays;

import java.util.ArrayList;
import java.util.List;

public class MostRepeatedElements {
    void main() {
        System.out.println(maxSubArray(new int[]{1,2,3,4,5}));
    }
    public static List<Integer> maxSubArray(int[] arr) {
        int repeated=1;
        int most=0;
        int i=arr[0];
        for(int j=1;j<arr.length;j++){
          if(arr[j]==i){
              repeated++;
              if(repeated>most) most=repeated;
          }
          else{
              i=arr[j];
              repeated=1;
          }
        }
        if(repeated>most) most=repeated;
        List<Integer> list=new ArrayList<>();
        repeated=1;
        i=arr[0];
        for(int j=1;j<arr.length;j++){
          if(arr[j]==i) repeated++;
          else{
              i=arr[j];
              if(repeated==most)  list.add(arr[j-1]);
              repeated=1;
          }
        }
        if(repeated==most)  list.add(arr[arr.length-1]);

        return list;
    }
}

package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddingLists {
     static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,1,2);
        List<Integer> list2= Arrays.asList(11,12,13,14,15);
        List<Integer> list3= merge(list,list2);
        System.out.println(list3);
    }
    public static List<Integer> merge(List<Integer> a, List<Integer> b){
        List<Integer> list = new LinkedList<>();
        int count=0;
        int point=a.size()<b.size()?a.size():b.size();
        int i=0,j=0,sum=0;
        while(i<a.size()||j<b.size()||sum!=0) {
            if (i < a.size()) {
                sum += a.get(i++);
                count++;
            }
            if (j < b.size()) {
                sum += b.get(j++);
                count++;
            }

            if(a.size()+b.size()==count) {
                list.add(sum);
                sum = 0;
            }else {
                list.add(sum % 10);
                sum = sum / 10;
                System.out.println("kumar");
            }
        }

        return list;
    }
}

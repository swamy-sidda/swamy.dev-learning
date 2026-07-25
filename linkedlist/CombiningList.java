package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CombiningList {
     static void main(String[] args) {
      Queue<Integer> list1 = new LinkedList<>();
      Queue<Integer> list2 = new LinkedList<>();
      list1.add(112);
      list1.add(221);
      list1.add(332);
      list1.add(443);
      list1.add(545);
      list1.add(623);
      list1.add(127);
      list1.add(821);
      list1.add(139);
      list1.add(109);
      list2.add(112);
      list2.add(221);
      list2.add(332);
      list2.add(443);
      list2.add(545);
      list2.add(623);
      list2.add(127);
      list2.add(821);
      list2.add(139);
      list2.add(109);
      List<Integer> lis=combine(list1,list2);
      System.out.println(lis);
    }
    public static List<Integer> combine(Queue<Integer> list1, Queue<Integer> list2) {
     List<Integer> list3 = new LinkedList<>();
     int carry = 0;
     int second=0;
     int first=0;
     while(!list1.isEmpty()||!list2.isEmpty()||carry!=0){
         if(list1.isEmpty())
             first=list1.poll();
         if(list2.isEmpty())
             second=list2.poll();
        carry=first+second+carry;
        list3.add(carry%10);
        carry/=10;
     }
        return list3;
    }
}

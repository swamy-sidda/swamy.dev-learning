package linkedlist;


import java.util.*;

public class ExtractOddList {
    static void main() {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      List<Integer> list2 = new ArrayList<>();
      list2.add(11);
      list2.add(12);
      list2.add(13);
      list2.add(14);
      list2.add(15);
      List<Integer> list3 = extractOddList(list, list2);
      System.out.println(list3);
    }
    public static List<Integer> extractOddList(List<Integer> list1,List<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Order());
        Integer i=0;
        while(i<list1.size() || i<list2.size()) {
            if(i<list1.size()) {
                if(list1.get(i)%2==1) {
                    list.add(list1.get(i));
                    queue.add(list1.get(i));
                }
            }
            if(i<list2.size()) {
                if(list2.get(i)%2==1) {
                    list.add(list2.get(i));
                    queue.add(list2.get(i));
                }
            }
            i++;
        }

        System.out.println("its queue "+queue);
        while(!queue.isEmpty()) {
            System.out.println( queue.poll());
        }
        return list;
    }
}
class Order implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}


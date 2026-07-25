package iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator2 {
    public static void main(String[] args) {
       iteration();
    }
    public static void iteration(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        System.out.println(list);
        ListIterator<String> iterator=  list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");
            //iterator.add(String.valueOf(iterator.hasNext()));
                System.out.println(iterator.hasPrevious());
        }
        System.out.println(list);
    }
}

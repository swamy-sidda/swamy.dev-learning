package iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
     iteration();
    }
    public static void iteration(){
        List<Character> list=new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        System.out.println(list);
        Iterator<Character> iterator=list.iterator();
        while (iterator.hasNext()){
           System.out.print(iterator.next()+" ");
            iterator.remove();
        }
        System.out.println();
        System.out.println(list.isEmpty());
    }
}

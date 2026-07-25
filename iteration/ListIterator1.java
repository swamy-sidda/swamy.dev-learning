package iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        System.out.println(iteration());
    }

    public static char iteration() {
        List<Character> list = new ArrayList<Character>();
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
        list.add('o');
        char c='\u0000';
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {

            c = iterator.next();
            iterator.remove();
            break;
        }
        System.out.println(list);
        return c;
    }
}


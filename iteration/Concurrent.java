package iteration;

import java.util.ArrayList;
import java.util.List;


public class Concurrent {
   public static void main(String[] args) {
       List<Character> list = new ArrayList<Character>();
       list.add('a');list.add('b');list.add('c');list.add('d');list.add('e');
       list.add('f');list.add('g');list.add('h');list.add('i');list.add('j');
       list.add('k');list.add('l');list.add('m');list.add('n');list.add('o');

//       for(int i=0;i<list.size();i++){
//           if(i==0)
//               list.remove(0);
//           System.out.println(list.get(i));
//       }
//       for(Character c:list){
//          list.remove(c);
//       }
    }
}

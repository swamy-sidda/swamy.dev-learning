package java8.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComposingPallindrome {
   public static void main(String[] args) {
        List<String> list= Arrays.asList("aabaa","malayalam","madam","pop","wow");


      List<String> list2=list.stream().map(e->e.chars().mapToObj(ch->(char)ch).
      toList().reversed().stream().map(i->String.valueOf(i)).collect(Collectors.joining())).toList();


        System.out.println("Pallindromes are :-");
      for(int i=0;i<list2.size();i++){
          if(list.get(i).equals(list2.get(i))){
              System.out.print(list.get(i)+" "+" ");
          }
      }
      System.out.println();
    }
}

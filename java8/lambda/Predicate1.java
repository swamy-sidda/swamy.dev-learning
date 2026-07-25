package java8.lambda;

import java.util.function.Predicate;

public class Predicate1 {
     static void main(String[] args) {
        Predicate<Integer> predicate = i->i>5;
        for(int i=1;i<=10;i++)
        {
            if(predicate.test(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        Predicate<String> predicate1 = i->i=="";
        String[] f={"s1","","s2","","kumar"};
        for(String s:f) {
            System.out.print(predicate1.test(s));
            System.out.print(" ");
        }
        System.out.println();
        Predicate<Character > predicate2 = i->i=='A';
        String s="KUMARSWAMY";
        for (int i=0;i<s.length();i++)
        {
            if(predicate2.test(s.charAt(i)))
            {
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
}

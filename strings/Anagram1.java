package strings;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String fd[]) {
        isAnagram("silent","listen");
        isAnagram("lisence","silence");
    }
     static void isAnagram(String str,String str1) {
        char[] a=str.toCharArray();
        char[] b=str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))  System.out.println("true");
                          else  System.out.println("false");
        System.out.println("by using string");
        String n=new String(a);
        String o=new String(b);
        System.out.println(n+" "+o);
        if(n.equals(o))  System.out.println("true");
                  else   System.out.println("false");
        System.out.println("---------------");
    }

}

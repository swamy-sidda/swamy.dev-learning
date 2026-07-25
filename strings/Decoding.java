package strings;

import java.util.Scanner;
class Decoding
{
    public static void main(String hh[])
    {
        String s="abcd";
        StringBuffer sb=encoder("abcd",26);
        System.out.println(sb.toString());
    }
    public static StringBuffer encoder(String s,int level) {
        StringBuffer s1 = new StringBuffer();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
         int sum=arr[i]+level;
         if(sum>=97&&sum<=122)
             s1.append((char)sum);
         else{
             sum=((arr[i]+level)%'z')+96;
             s1.append((char)sum);
         }
        }
        return s1;
    }
}

package strings;

import java.util.Scanner;
class Find_Index
{
    public static void main(String ad[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        System.out.println("Enter a character to search its index");
        char ch=sc.nextLine().charAt(0);
        System.out.println("index of character"+ch+" is ");
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            if(ch==s1)
                System.out.println(i);
        }
    }
}
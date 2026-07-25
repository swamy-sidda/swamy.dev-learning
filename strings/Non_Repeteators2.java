package strings;
//count every digit for first time and neglegct for next time and print first occurence;

import java.util.Scanner;
class Non_Repeteators2
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int count=0;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s1.indexOf(s.charAt(i))==-1)
            {
                s1+=s.charAt(i)+" ";
                count++;
            }
        }
        System.out.println(s1);
        System.out.println(count);
    }
}
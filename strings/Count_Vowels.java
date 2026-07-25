package strings;

import java.util.Scanner;
public class Count_Vowels
{
    public static void main(String string[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        String str=s.toLowerCase();
        int count=0;
        for(char c:str.toCharArray())
        {
            count++;
        }
        int vowel_count=0;
        for(int i=0;i<count;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowel_count++;
            }
        }
        if(vowel_count>0)
            System.out.println("total No:of vowels in String is "+vowel_count);
        else
            System.out.println("no vowel found in given String ");
    }
}
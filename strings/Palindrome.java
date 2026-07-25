package strings;

import java.util.Scanner;
class Palindrome
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        char[] a=str1.toCharArray();
        int i=0,j=a.length-1;

        boolean temp=true;
        while(i<j)
        {
            if(a[i]!=a[j])
                temp=false;
            i++;
            j--;
        }
        if(temp==true)
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}
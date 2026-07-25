package strings;

import java.util.Scanner;
class Non_Repeteators1
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s1.indexOf(s.charAt(i))==-1)
            {
                s1+=s.charAt(i);
                System.out.print(s.charAt(i)+" ");
                s=s.replaceAll(s.charAt(i)+"","");
            }

        }
    }

}

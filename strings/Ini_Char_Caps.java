package strings;
///////////////////////////////////////////////////////
import java.util.Scanner;
public class Ini_Char_Caps
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Statement");
        String s=sc.nextLine();
        String s2="";
        int i=s.length()-1;
        while(i>=0)
        {
            String s1="";
            char ch=s.charAt(i);
            while(ch>='a'&&ch<='z')
            {
                s1+=ch;
                i--;
            }
            for(int j=0;j<s1.length();j++)
            {
                char ch1=s1.charAt(j);
                if(j==0)
                    s2+=(char)((int)ch1-32);
                else
                    s2+=ch1+"";
            }
            s2+=ch+"";
            i--;
            s1="";
        }
        System.out.println(s2);
    }
}
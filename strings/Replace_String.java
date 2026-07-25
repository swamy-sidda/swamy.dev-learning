package strings;
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
import java.util.Scanner;
public class Replace_String
{
    public static void main(String fh[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a statement");
        String s=sc.nextLine();
        System.out.println("enter string to find");
        String s1=sc.nextLine();
        System.out.println("enter a string to replace");
        String s2=sc.nextLine();
        String str="";
        int i=0;
        while(i<=s.length())
        {
            String word="";
            while(s.charAt(i)!=' ')
            {
                word+=s.charAt(i)+"";
                ++i;
            }
            if(word.equals(s1))
            {
                str+=s2+" ";
            }
            else
                str+=word+" ";

        }
        System.out.println(str);
    }
}

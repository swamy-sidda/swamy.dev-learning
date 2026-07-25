package strings;
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
import java.util.Scanner;
public class CharArray_StringArray
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a statement");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int count=1;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
                count++;
        }
        System.out.println(count);
        int a=0;
        String[] s1=new String[count];
        int k=0;
        String str="";
        while(k<ch.length)
        {
            if(ch[k]!=' ')
            {
                str+=ch[k];
                k++;
                if(a<=count-1)
                    continue;
            }
            if(ch[k]==' ')
            {
                s1[a]=str;
                str="";
                k++;
                a++;
            }
        }
        for(String st:s1)
            System.out.println(st);
    }
}
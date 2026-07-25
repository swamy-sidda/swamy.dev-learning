package strings;

import java.util.Scanner;

class EncodingSample
{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String ");
        String s=sc.nextLine();
        System.out.println("Enter the encoding level");
        int i=sc.nextInt();
        String s1=encoding(s,i);
        System.out.println(s1);
    }
    public static String encoding(String s,int level)
    {
        String s1="";
        char[] a=s.toCharArray();
        char[] ch="abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<'a'||a[i]>'z')
            {
                s1+=a[i];
                continue;
            }
            for(int j=0;j<ch.length;j++)
            {
                if(a[i]!=ch[j])
                    continue;
                int index=j;
                index+=level;
                index=index%26;
                s1+=ch[index];
            }
        }
        return s1;
    }
}


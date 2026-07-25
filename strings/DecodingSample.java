package strings;

import java.util.Scanner;
class DecodingSample
{
    public static void main(String hh[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s=sc.nextLine();
        System.out.println("enter level of decoding");
        int n=sc.nextInt();
        String s1=encoder(s,n);
        System.out.println(s1);

    }
    public static String encoder(String s,int level)
    {
        char[] a=s.toCharArray();
        char[] ch="abcdefghijklmnopqrstuvwxyz".toCharArray();
        String s1="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<'a'||a[i]>'z')
            {
                s1+=a[i];
                continue;
            }

            for(int j=0;j<ch.length;j++)
            {
                if(a[i]==ch[j])
                {
                    int index=j-level;
                    if(index<0)
                    {
                        index=26+index;
                    }
                    index=index%26;
                    s1+=ch[index];
                }
            }
        }
        return s1;

    }
}
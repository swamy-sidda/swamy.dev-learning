package strings;

import java.util.Scanner;
public class Max_Occurence_Char
{
    public static void main(String ah[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int count=0;
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            String res="";
            int count1=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(ch==s.charAt(j)){
                    res+="";
                    count1++;
                }
                else
                    res+=s.charAt(j);
            }
            s=res;
            if(count==0||count<=count1){
                count=count1;
                s2=ch+"";
            }
            count1=0;
            i-=1;
        }
        System.out.println(count);
        System.out.println(s2);
    }
}












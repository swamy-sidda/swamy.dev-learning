package strings;

import java.util.Scanner;
public class Count_String1
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String st=sc.nextLine();
        int count=0;
        for(char c:st.toCharArray())
        {
            if(c>='A' && c<='z')
                count++;
        }
        System.out.println("No:of characgters in String is:"+count);
    }
}
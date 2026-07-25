package strings;

import java.util.Scanner;
public class UpperCase
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s=sc.nextLine();
        String str="";
        for(int j=0;j<s.length();j++){
  /* for(char i='a';i<='z';i++){
    if(i==s.charAt(j))
     {
       str=str+(char)(s.charAt(j)-32);
     }
   }
  }
   System.out.println(str);
 }
}
*/

            char ch=s.charAt(j);
            if(ch>='A'&&ch<='Z')
            {
                str=str+(char)(ch+32);
            }
            else{
                str+=ch;
            }

        }
        System.out.println(str);
    }
}
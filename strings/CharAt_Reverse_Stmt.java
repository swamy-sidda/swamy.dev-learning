package strings;

import java.util.Scanner;
class CharAt_Reverse_Stmt
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        code_Executor(s);
    }
    static void  code_Executor(String s)
    {

        int i=s.length()-1,j=s.length()-1;
        while(i>=0){
            String s1="";
            if(s.charAt(i)!=' ')
            {
                s1+=s.charAt(i);
                --i;
            }
            else{
                i--;
                s1+=" ";
            }


            System.out.print(s1);
        }
    }
}
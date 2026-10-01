package basics;

import java.util.Scanner;

class BankCount
{
    public static void main(String ae[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount in 100 multiple");
        int amt=sc.nextInt();
        int note;
        if(amt>=100)
        {
            if(amt>=200)
            {
                if(amt>=500)
                {
                    if(amt>=2000)
                    {
                        note=amt/2000;
                        System.out.println("2000 notes are"+note);
                        amt=amt%2000;
                    }
                    note=amt/500;
                    System.out.println("500 notes are"+note);
                    amt=amt%500;

                }
                note=amt/200;
                System.out.println("200 notes are"+note);
                amt=amt%200;

            }
            note=amt/100;
            System.out.println("100 notes are"+note);
            amt=amt%100;

        }
    }
}
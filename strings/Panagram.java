package strings;

public class Panagram
{
    public static void main(String as[])
    {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPanagram(s));
    }
    public static boolean isPanagram(String s)
    {
        if(s.length()<26) return false;
        for(char ch='a';ch<='z';ch++)
        {
            if(!s.contains(ch+"")) return false;
        }
        return true;
    }
}
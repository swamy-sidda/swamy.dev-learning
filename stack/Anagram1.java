package stack;

public class Anagram1
{
    public static void main(String fd[])
    {
        System.out.println(isAnagram("silent","listen"));
        System.out.println(isAnagram("lisence","silence"));
    }

    public static boolean isAnagram(String a,String b)
    {
        while(a.length()>0 && b.length()>0)
        {
            if(a.length()!=b.length()) return false;
            char c=a.charAt(0);
            a=a.replace(c+"","");
            b=b.replace(c+"","");
        }
        return true;
    }
}
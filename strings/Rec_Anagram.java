package strings;

public class Rec_Anagram
{
    public static void main(String ad[])
    {
        System.out.println(isAnagram("silent","listen"));
        System.out.println(isAnagram("silence","lisence"));
        System.out.println(isAnagram("madam","buddi"));
        System.out.println(isAnagram("1234","1234"));
        System.out.println(isAnagram("asdgg","asdfg"));
        System.out.println(isAnagram("aaaaa","aaaaa"));

    }
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()==0 && b.length()==0) return true;
        if(a.length()!=b.length()) return false;
        char c=a.charAt(0);
        a=a.replace(c+"","");
        b=b.replace(c+"","");
        return isAnagram(a,b);
    }
}
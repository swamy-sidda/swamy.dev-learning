package strings;

public class CountOccurence
{
    public static void main(String as[])
    {
        String s="banana";
        for(int i=0;i<s.length();i++)
        {
            String s1="";
            char ch=s.charAt(i);
            if(ch=='\u0000') continue;
            String s2=ch+"";
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch1=='\u0000') continue;
                if(ch==ch1)
                    s1+=j+",";
            }
            s2+="="+s1;
            System.out.println(s2);
            s=s.replaceAll(ch+"","\u0000");
            s1="";
            s2="";
        }
    }
}
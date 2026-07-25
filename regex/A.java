package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A
{
    public static void main(String ad[])
    {
        String s="12am";
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher(s);
        int s1=0;
        while(m.find())
        {
            s1+=Integer.parseInt(m.group());
        }
        System.out.println(s1);
    }
}
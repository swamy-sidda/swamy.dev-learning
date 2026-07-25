package strings;

class Balanced_String
{
    public static void main(String[] at)
    {
        String s="k{u[(m)a(r)]}";
        boolean b=balanced_String(s);
        if(b==true)
            System.out.println("Balanced String");
    }
    static String removeChars(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i=='['||i==']'||i=='{'||i=='}'||i=='('||i==')')
                s1+=c;
        }
        return s1;
    }
    static boolean balanced_String(String s)
    {
        s=removeChars(s);
        while(s.contains("[]")||s.contains("{}")||s.contains("()"))
        {
            s=s.replace("{}","");
            s=s.replace("[]","");
            s=s.replace("()","");
        }
        return s.length()==0;
    }

}
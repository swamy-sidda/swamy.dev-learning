package strings;

class String_Methods
{
    public static void main(String man[])
    {
        String s="kumar swamy";
        for(int i=0;i<s.length();i++)
        {
            System.out.println("a["+i+"]="+s.charAt(i)+"  ");
        }
        System.out.println("length of string is "+s.length());


        System.out.println("index of character K is "+s.indexOf('m'));
        System.out.println("index of character K is "+s.indexOf('z'));


        System.out.println("character at 9 index is "+s.charAt(9));
        System.out.println("character at 14 index is "+s.indexOf(14));



        System.out.println("index of string swa is "+s.indexOf("swa"));
        System.out.println("index of string swa is "+s.indexOf("satya"));


    }
}
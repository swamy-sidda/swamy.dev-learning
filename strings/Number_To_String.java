package strings;

class number_To_String
{
    public static void main(String ad[])
    {
        int num=123452134;
        pw(num/10000000," crore ");
        pw((num/100000)%100," lakhs ");
        pw((num/1000)%100," thousand ");
        pw((num/100)%10," hundred ");
        pw(num%100," ");
    }
    public static void pw(int num,String s)
    {
        String[]one={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] two={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        if(num<=19)
            System.out.print(one[num]);
        else
            System.out.print(two[num/10]+" "+one[num%10]);
        if(num!=0)
            System.out.print(s);
    }
}
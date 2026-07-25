package designpatterns.singleton;

public class SingleTon_Demo2
{
    public static void main(String as[])
    {
        SingleTon s1=SingleTon.getInstance();
        SingleTon s2=SingleTon.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);
        System.out.println(s2==s1);
    }
}

//synchronized singleton class for thread safe
//to achieve
//make the static method as synchronized



class SingleTon
{
    private static SingleTon st;
    private SingleTon(){}

    public static synchronized SingleTon getInstance()
    {
        if(st==null) return st=new SingleTon();
        return st;
    }
}
package designpatterns.singleton;

public class SingleTon_Demo4
{
  public static void main(String ad[])
  {
     SingleTonMem s1=SingleTonMem.getInstance();
     SingleTonMem s2=SingleTonMem.getInstance();

     System.out.println(s1);
     System.out.println(s2);
     
     System.out.println(s1==s2);
     System.out.println(s2==s1);

  }
}

//early instansiation/initialinzation of object.
//by using static block  singleton by using 'final' keyword of java
 
class SingleTonMem
{
 private static final SingleTonMem st;
 static
  {
   st=new SingleTonMem();
  }

 private SingleTonMem(){}
 
public static SingleTonMem getInstance()
{
  return st;
}
}
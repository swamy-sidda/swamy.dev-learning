package designpatterns.singleton;

public class SingleTon_Demo3
{
  public static void main(String ad[])
  {
     SingleTonClass s1=SingleTonClass.getInstance();
     SingleTonClass s2=SingleTonClass.getInstance();

     System.out.println(s1);
     System.out.println(s2);
     
     System.out.println(s1==s2);
     System.out.println(s2==s1);

  }
}

//double checked locking to singleton by using 'volatile' keyword of java
 
class SingleTonClass
{
 private static volatile SingleTonClass st;

 private SingleTonClass(){}
 
public static synchronized SingleTonClass getInstance()
{
  if(st==null) st=new SingleTonClass();
  return st;
}
}
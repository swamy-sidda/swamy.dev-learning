package exceptionhandling;

public class ClassCast_Exception  //unchecked
{
 public static void main(String al[])
 {
  AAA a=new BBB();
  AAA b=new CCC();
  try{
       CCC c=(CCC)b;
       System.out.println(c);
       CCC s=(CCC) a;
       System.out.println(c);
     }catch(ClassCastException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }
 }
}
class AAA
{

}
class BBB extends AAA
{

}
class CCC extends AAA
{

}
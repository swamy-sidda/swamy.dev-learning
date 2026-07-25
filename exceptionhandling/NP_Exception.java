package exceptionhandling;

public class NP_Exception  //unchecked

{
 public static void main(String al[])
 {
  String s=null;
    try{
        System.out.println(s);
       System.out.println(s.length());
     }catch(NullPointerException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }
 }
}
package exceptionhandling;

public class SIOB_Exception//unchecked

{
 public static void main(String al[])
 {
  String s="kumar swamy";
  for(int i=0;i<=s.length();i++)
  try{
       System.out.println(s.charAt(i));
     }catch(StringIndexOutOfBoundsException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }
 }
}
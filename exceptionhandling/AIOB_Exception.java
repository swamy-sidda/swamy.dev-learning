package exceptionhandling;

public class AIOB_Exception//unchecked

{
 public static void main(String al[])
 {
  int[] a={10,20,30,40};
  for(int i=0;i<=a.length;i++)
  try{
       System.out.println(a[i]);
     }catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }
 }
}
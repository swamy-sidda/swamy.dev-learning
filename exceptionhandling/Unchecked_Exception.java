package exceptionhandling;

public class Unchecked_Exception
{
 public static void main(String ah[])
  {
try{
     System.out.println(10/0);
    }catch(ArithmeticException e){
     System.out.println(e.getMessage());
     System.out.println("--------------------");
     e.printStackTrace();
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }catch(StringIndexOutOfBoundsException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }catch(NullPointerException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }catch(ClassCastException e){
       System.out.println(e.getMessage());
       System.out.println("-------------");
       e.printStackTrace();
     }catch(RuntimeException e){
        //handling statements
     }catch(Exception e){
      //handling Statements
     }

 }
}
package exceptionhandling;

public class UnHandleExceptoin extends Exception
{
 String msg=null;
 
 public UnHandleExceptoin(String msg)
 {
   this.msg=msg;
 }
public String getMessage()
{
 return msg;
}
}
package exceptionhandling;

class PasswordMismatchException extends Exception
{
  private String message;
  PasswordMismatchException(String msg)
  {
    this.message=msg;
  }
 public String getMessage()
 {
    return message;
 }
}


class MailMismatchException extends Exception
{
  private String message;
  MailMismatchException(String msg)
  {
    this.message=msg;
  }
public String getMessage()
{
  return message;
}
}



class InvalidInputException extends RuntimeException
{
  private String msg;
  InvalidInputException(String msg)
  {
     this.msg=msg;
  }
 public String getMessage()
 {
   return msg;
 }
}

class InputMismatchedException extends RuntimeException
{
  private String msg;
  InputMismatchedException(String msg)
  {
     this.msg=msg;
  }
 public String getMessage()
 {
   return msg;
 }
}


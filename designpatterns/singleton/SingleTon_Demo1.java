package designpatterns.singleton;

public class SingleTon_Demo1
{
 public static void main(String ad[])
  {
   SingleTon_Class s1=SingleTon_Class.getInstance();
   SingleTon_Class s2=SingleTon_Class.getInstance();
   SingleTon_Class s3=SingleTon_Class.getInstance();
   
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);

  System.out.println(s1==s2);
  System.out.println(s1==s3);


  }
} 

//for lazy instansiation/ lazy initialization of object
//to make class as singleton 
//1.declare variable of type of class as private 
//2.make the constructor as private
//3.declare a static method to return class object
  //->it will create and return for first call
  //->return same object for next calls 

class SingleTon_Class
{
 private static SingleTon_Class st;
 private SingleTon_Class(){}
public static SingleTon_Class getInstance()
 {
   if(st==null)
   {
     st=new SingleTon_Class();
   }
   return st;
 }
}


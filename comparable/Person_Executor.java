package comparable;

import java.util.Arrays;

public class Person_Executor
{
 public static void main(String ar[])
 {
  Person[] a=new Person[8];
  a[0]=new Employee34("karan",24,"software");
  a[1]=new Student34("kiran",21,"graduate");
  a[2]=new Student34("nani",14,"postfraduate");
  a[3]=new Employee34("samay",23,"software");
  a[4]=new Student34("swamy",20,"graduate");
  a[5]=new Student34("vamsi",24,"postgraduate");
  a[6]=new Employee34("praneeth",24,"software");
  a[7]=new Employee34("hamsa",25,"engineer");

Arrays.sort(a);
for(Person p:a)
  System.out.println(p);

 }
} 
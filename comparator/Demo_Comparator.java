package comparator;

import java.util.Arrays;
import java.util.Comparator;
class Sal_Compare implements Comparator  
{
  public int compare(Object arg1,Object arg2)
  {
    Employee32 e1=(Employee32) arg1;
    Employee32 e2=(Employee32) arg2;
    if(e1.sal>e2.sal) return 1;
    if(e1.sal<e2.sal) return -1;
    return 0; 
  }
}


class Employee32
{
 String name;
 int sal;
 int id;
 static int num=1010;
 Employee32(String s,int r)
 {
  this.name=s;
  this.sal=r;
   id=num++;
 }
public String toString()
{
 return "Employee[name="+name+" sal="+sal+" id="+id+"]";
}
}

public class Demo_Comparator
{
  public static void main(String t[])
 {
  Employee32[] a=new Employee32[5];
  a[0]=new Employee32("kumar",1200);
  a[1]=new Employee32("pravali",2200);
  a[2]=new Employee32("munuswamy",1400);
  a[3]=new Employee32("hari",4200);
  a[4]=new Employee32("umar",2300);

   Arrays.sort(a,new Sal_Compare());
   for(Employee32 z:a)
   System.out.println(z);
  }
}





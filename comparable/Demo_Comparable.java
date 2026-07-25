package comparable;

import java.util.Arrays;

class Employee implements Comparable
{
    String name;
    int id;
    double sal;
    private static int num=101;
    Employee(String n,double b)
    {
        this.name=n;
        this.sal=b;
        id=num++;
    }
    public int compareTo(Object arg)
    {
        Employee e=(Employee) arg;
        return name.compareTo(e.name);
    }
    public String toString()
    {
        return "employee[name="+name+" sal="+sal+" id="+id+"]";
    }
}

public class Demo_Comparable
{
    public static void main(String ar[])
    {
        Employee[] a=new Employee[5];
        a[0]=new Employee("kumar",1200);
        a[1]=new Employee("umar",1800);
        a[2]=new Employee("amar",2300);
        a[3]=new Employee("manas",2100);
        a[4]=new Employee("bhanu",6700);
        Arrays.sort(a);
        for(Employee c:a)
            System.out.println(c);
    }
}















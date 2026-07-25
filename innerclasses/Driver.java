package innerclasses;

public class Driver {
     static void main(String sd[])
    {
        Student.Department dept1=new Student.Department();
        dept1.add(10,20);
    }
}

class Student
{
    String name;
    int salary;
    Student(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public static void add(int i,int j)
    {
      System.out.println(i+j);
      System.out.println("its done already");
    }
   static class  Department
    {
     public void add(int i,int j)
     {
         System.out.println(i+j);
         System.out.println("its inner cl;ass method ");
         System.out.println("calculated correctly");
     }

    }
}

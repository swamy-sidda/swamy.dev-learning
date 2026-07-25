package java8.second;

import java.util.*;

public class MaxEmp {
     static void main(String[] args) {
      List<Employee> list =new ArrayList<>();
        Employee e=new Employee("kumar",10);
        Employee e1=new Employee("umar",20);
        Employee e2=new Employee("dinesh",30);
        Employee e3=new Employee("prasad",40);
        Employee e4=new Employee("prateek",50);
      list.add(e);
      list.add(e1);
      list.add(e2);
      list.add(e3);
      list.add(e4);
      Employee max=list.stream().max((i, j)->i.getAge().compareTo(j.getAge())).get();
      System.out.println(max.getName()+" "+max.getAge());
      Employee emp=list.stream().min((i, j)->i.getAge().compareTo(j.getAge())).get();
      System.out.println(emp.getName()+" "+emp.getAge());

      
    }
}
class Employee{
    String name;
    Integer age;

    public Employee(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }


}

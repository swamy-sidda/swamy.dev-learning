package innerclasses;

public class Regular {
    public static void main(String []ar){
       Student s=new Student("kumar",12300);
       Student.Department dept=s.new Department();
       s.subtract();
       //s.add(10,10);
        dept.add(10,20);
       Student.Department dept1=new Student().new Department();
    }
}




class Student {
    String name;
    double salary;
    Student(){}
    Student(String n,double s){
        name=n;
        salary=s;
    }
    public void subtract() {
        System.out.println("the name is "+this.name);
        System.out.println("the salary is "+this.salary);
    }
    class Department extends Student{
        String name;
        Department(){
            super();
        }
        Department(String n, double s) {
            super(n, s);
        }

        public void add(int i,int j){
           System.out.println("the result is "+i+j);
           System.out.println("the name is "+super.name);
           System.out.println("the salary is "+super.salary);
       }
    }
}

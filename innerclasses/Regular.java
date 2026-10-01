package innerclasses;

public class Regular {
    public static void main(String []ar){
       Student12 s=new Student12("kumar",12300);
       Student12.Department dept=s.new Department();
       s.subtract();
       //s.add(10,10);
        dept.add(10,20);
       Student12.Department dept1=new Student12().new Department();
    }
}




class Student12 {
    String name;
    double salary;
    Student12(){}
    Student12(String n,double s){
        name=n;
        salary=s;
    }
    public void subtract() {
        System.out.println("the name is "+this.name);
        System.out.println("the salary is "+this.salary);
    }
    class Department extends Student12{
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

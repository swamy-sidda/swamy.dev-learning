package java8.lambda;



import java.sql.SQLOutput;
import java.util.function.Function;

public class Function6 {
     static void main(String[] args) {
        Employee1[] emp={
                new Employee1(1,"kumar",1239.0),
                new Employee1(2,"swamy",1234.98),
                new Employee1(3,"amar",1564.98),
                new Employee1(4,"nayan",1234.98),
        };

        Function<Employee1,Double> function=i->i.salary;
        for(Employee1 e:emp){
            System.out.println(function.apply(e));
        }
    }
}
class Employee1{
    int id;
    String name;
    double salary;
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int compareTo(Employee1 e){
        if(this.salary>e.salary) return -1;
        else if(this.salary<e.salary) return 1;
        else return 0;
    }
}

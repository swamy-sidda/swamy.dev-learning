package java8.lambda;



import java.util.function.Consumer;
import java.util.function.Function;

public class Consumer2 {
     static void main(String[] args) {
        Employee2[] emp={
                new Employee2(1,"kumar",1239.0),
                new Employee2(2,"swamy",1234.98),
                new Employee2(3,"amar",1564.98),
                new Employee2(4,"nayan",1234.98),
        };
        Consumer<Employee2> function=e->System.out.println(e.id+" "+e.name+" "+e.salary);
        for(Employee2 e:emp){
            function.accept(e);
        }
        Consumer<Employee2> consumer=e->System.out.println(e.salary+1000);
        for(Employee2 e:emp){
            consumer.accept(e);
        }
    }
}
class Employee2{
    int id;
    String name;
    double salary;
    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


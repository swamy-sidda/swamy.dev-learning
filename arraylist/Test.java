package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\n' + ", age=" + age + '}';
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "kumar", 22));
        list.add(new Student(2, "jitu", 19));
        list.add(new Student(3, "prem", 25));
        list.add(new Student(4, "nikhil", 32));

        list.sort(Comparator.comparingInt(a -> a.age));
//        Collections.sort(list, (a, b) -> {
//            if(a.age > b.age){
//                return 1;
//            }else if(a.age < b.age){
//                return -1;
//            }
//            return 0;
//        });

        System.out.println(list);
    }
}

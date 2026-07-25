package java8.api;

import java.util.ArrayList;
import java.util.List;

public class Employer {
     static void main(String[] args) {
       Emp2 e=new Emp2("kumar","madanapalli",20);
       Emp2 e1=new Emp2("shiva","paderu",20);
       Emp2 e2=new Emp2("manju","kasirao peta",20);
       Emp2 e3=new Emp2("dinakar","ongole",20);
       Emp2 e4=new Emp2("prabha","ananthapuram",43);
       List<Emp2> list=new ArrayList<Emp2>();
       list.add(e);
       list.add(e1);
       list.add(e2);
       list.add(e3);
       list.add(e4);
       e=new Emp2("nayan","sagileru",27);
       e1=new Emp2("samay","vanam",24);
       e2=new Emp2("arjun","tirupati",32);
       e3=new Emp2("karna","nandyala",35);
       e4=new Emp2("kamal","kona seema",40);
        list.add(e);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Emp2 min= list.stream().min((x, y)->x.getAge()-y.getAge()).get();
        System.out.println("age2="+min.getAge());
        System.out.println("--------------------");
        Emp2 max=list.stream().max((x,y)->x.getAge()-y.getAge()).get();
        int age1=max.getAge();
        System.out.println("age1="+age1);
        System.out.println("age2="+max.getAge());
        System.out.println("--------------------");
//        list.stream().filter(y->age1==y.getAge()).forEach(x->System.out.println(x.getName()));
////        System.out.println("--------------------------------");
////        list.stream().max((x,y)->x.getAddress().length()-y.getAddress().length()).stream().skip(2).findFirst().ifPresent(y->System.out.println(y.getName()));
////        System.out.println("--------------------------------");
////        list.stream().distinct().sorted((x,y)->x.getAge()-y.getAge()).distinct().forEach(x->System.out.println(x.getAge()));
//          Emp2 integer=  list.stream().sorted((x,y)->Integer.compare(y.getAge(),x.getAge())).distinct().
//                         skip(2).findFirst().get();
//          System.out.println("Third max age employee is "+integer.getAge());
//          Integer inte=list.stream().map(x->x.getAge())
//                    .distinct().skip(0).findFirst().get();
//          list.stream().filter(y->inte==y.getAge()).forEach(x->System.out.println(x.getName()+
//                  " "+x.getAddress()+" "+x.getAge()));

    }
}
class Emp2 {
    String name;
    String address;
    int age;
    Emp2(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }

}

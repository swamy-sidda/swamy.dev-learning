package java8.api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreameCreation {
     static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().forEach(i->System.out.print(i+" "));
        System.out.println();
        //Arrays.stream()
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(arr).filter(i->i%2==0).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(arr).filter(i->i%2==0).map(i->i*i).forEach(i->System.out.print(i+" "));
        System.out.println();
        int sum=Arrays.stream(arr).sum();
        System.out.println(sum);
        //streame..of(v1,v2,v3,v4....)
        Stream.of(10,20,30,40,40,50,60,70,80,90).forEach(i->System.out.print(i+" "));
        System.out.println();
        Stream.of("string","kumar","manan","kushal","manav","komal").forEach(i->System.out.print(i+" "));
        System.out.println();
        Stream.of("string","kumar","manan","kushal","manav","komal").map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));
        System.out.println();
        Stream.of("string","kumar","manan","kushal").map(String::toUpperCase).forEach(i->System.out.print(i+" "));
        System.out.println();
        Stream.of(12,23,34,55,6,78,8,9,5,43,2,2,34,5643,4,5,6,33,4,5,43,4,5,3,4).filter(i->i>15).distinct().sorted().forEach(System.out::println);
        Emp1 e1=new Emp1("umar",20000);
        Emp1 e2=new Emp1("amar",10000);
        Emp1 e3=new Emp1("samay",30000);
        Emp1 e4=new Emp1("ratan",40000);
        Stream.of(e1,e2,e3,e4).forEach(i->System.out.print(i.name+" "));
        System.out.println();
        Stream.of(e1,e2,e3,e4).forEach(i->System.out.print(i.salary+" "));

    }
}
class Emp1{
    String name;
    int salary;
    Emp1(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}

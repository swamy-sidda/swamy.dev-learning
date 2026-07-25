package java8.api;

import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamCreation2 {
     static void main(String[] args) {
        //for printing values we need to use limit with combination of Stream.generate() method.
        Stream.generate(()->1).limit(10).forEach(i->System.out.print(i+" "));
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        stream.forEach(System.out::print);
        System.out.println();
        System.out.println("integers printing");
        Random random = new Random();
        Stream.generate(()->random.nextInt(100)).limit(5).forEach(i->System.out.print(i+" "));
        System.out.println();
        System.out.println("Double printing");
        Stream.generate(()->random.nextDouble(123.987)).limit(5).forEach(i->System.out.print(i+" "));
        System.out.println();
        System.out.println("Float printing");
        Stream.generate(()->random.nextBoolean()).limit(5).forEach(i->System.out.print(i+" "));
        System.out.println();
        System.out.println("random UUID");
        Stream.generate(UUID::randomUUID).limit(5).forEach(i->System.out.println(i.toString()+" "));
        System.out.println();





        Stream<Integer> stream1=Stream.iterate(1,i->i+2);
        stream1.limit(10).forEach(i->System.out.print(i+" "));
        System.out.println();
    }
}

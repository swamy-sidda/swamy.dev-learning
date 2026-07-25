package java8.lambda;

import java.util.function.Consumer;

public class Consumer1 {
     static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hello");
        consumer.accept("hello");
        consumer.accept("hello");
    }
}

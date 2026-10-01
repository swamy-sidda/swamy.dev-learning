package arrays.arrays;

import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] as) {
        String str = "kumarswamy";
        String string = str.chars().mapToObj(e -> String.valueOf((char) e)).collect(Collectors.joining("" +
                ""));
        System.out.println(string);
    }
}
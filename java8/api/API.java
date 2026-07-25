package java8.api;

import java.util.Arrays;

public class API {
     static void main(String[] args) {
        int[] a={10,2,3};
      int s=  Arrays.toString(a).chars().map(e->(char)e).findFirst().getAsInt();
        System.out.println((char)s);
    }
}

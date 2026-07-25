package basics;

public class value {
     static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b-(a=b);
        b=a+b-(b=a);
        System.out.println(a);
        System.out.println(b);
    }
}

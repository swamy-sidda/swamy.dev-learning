package basics;

//import oop.inheritance.Child;

public class print {
     static void main(String[] args) {
        display(10);
    }
    static void display (int n) {
        if (n <1) return;
        System.out.println(n);
        display(n-1);
    }
}

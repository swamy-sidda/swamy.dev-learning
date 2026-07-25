package java8.second;

import java.util.Comparator;
import java.util.Optional;

public class Pallindrome {
    static void main(String[] args) {
        String string="";
        Optional<String> str= string.chars().mapToObj(e->(char)e).map(e->String.valueOf(e)).
                toList().reversed().stream().reduce((a,b)->a+b);
        if(str.isPresent()){
            if(str.get().equals(string)){
                System.out.println(str.get()+" is palindrome ");
            }
            else{
                System.out.println(str.get()+" is not palindrome ");
            }
        }
        else{
            System.out.println("string is empty ");
        }

    }
    }


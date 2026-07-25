package iteration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Entry2 {
    public static void main(String[] args) {
  entry1();
    }
    public static void entry1(){
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
       map.put(1,10);
       map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,60);
        map.put(7,70);
        map.put(8,80);
        map.put(9,90);
        map.put(10,10);
        map.put(11,20);
        map.put(12,30);

        for(Map.Entry<Integer,Integer>enry:map.entrySet()){
            System.out.print(enry.getKey()+" ");
            System.out.print(enry.getValue()+" ");
            System.out.println();

        }


    }
}

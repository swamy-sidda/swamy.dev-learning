package java8.second;

import java.util.*;
import java.util.stream.Collectors;

public class PartitioningBy {
   public static void main(String[] args)
        {
            List<Character> list= Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n','o','u');
            Map<Boolean,List<Character>> map= list.stream().collect(Collectors.partitioningBy(s -> s=='a'||s=='e'
                    ||s=='i'|| s=='o'||s=='u'));
            System.out.println(map);

            List<Integer> list1 =Arrays.asList(1,2,3,541,5,96,7,78,9,10,111,12);
            Set<Integer> set = new HashSet<>();
            list1.parallelStream().unordered().filter(e->e%1==0).toList().stream().unordered().forEach(e->set.add(e));
            System.out.println(set);
            set.stream().map(e->e).toList().forEach(e->System.out.println(e));
        }
    }

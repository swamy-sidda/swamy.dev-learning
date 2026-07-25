package strings;

import java.util.ArrayList;
import java.util.List;

public class PossibleStrings {
    public static void main(String[] args) {
      iterate("malayalam");
    }
    public static void iterate(String s){

          for(int j=2;j<s.length();j++){
             List<String> list= possibleStrings(s,j+1);
             System.out.println(list);
          }
    }
    public static List<String> possibleStrings(String s,int limit){
       List<String> list = new ArrayList<>();
        int i=0;
        int count=limit;
        while(count<=s.length()){
           String str= s.substring(i,count);
          if(!list.contains(str)) list.add(str);
          i++;
          count++;
        }
        return list;

    }
}

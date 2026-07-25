package strings;

import java.util.LinkedList;
import java.util.List;

public class StringsBetweenOvels {
    static void main(String[] args) {
     iterateString("eptrwagtyrwqvinhyrdfopnbvczxurwtdesvbnm");
    }
    public static void iterateString(String str) {
        str=str.toLowerCase()+" ";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i') {
               List<String> list= possibleStrings(str.substring(i,str.length()-1));
               System.out.println(str.charAt(i)+":");
               System.out.println(list);
            }
        }

    }
    public static List<String> possibleStrings(String str) {
        List<String> list = new LinkedList<>();
        int i=0;

        while(i<str.length()) {
           char ch = str.charAt(i++);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
               list.add(str.substring(0,str.length()));
           }
        }

        return list;
    }
}

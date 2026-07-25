package treemap;



import java.util.TreeMap;
import java.util.Map;

public class OddOccurences {
    public static void main(String args[]){
        String str="underdeveloped";
        Map<Character,Integer> map=occurences(str);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2==1) {
                System.out.print(entry.getKey() + " " + entry.getValue());
                System.out.println();
            }
        }
    }
    public static Map occurences(String str){
        Map<Character,Integer> map=new TreeMap<>();
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }

        return map;
    }
}

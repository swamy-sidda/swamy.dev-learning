package treemap;

public class OddOccurences1 {
    public static  void main(String args[]){
      findOccurences("banana");
    }
    public static void findOccurences(String st){
        String str=st;
        int i=0;
        while(str.length()>0){
            int count=0;
            int j=0;
                while (j < str.length()) {
                    if (str.charAt(i) == str.charAt(j)) count++;
                    ++j;
                }
                if(count%2!=0)
                {
                    System.out.println( count +" "+str.charAt(0));
                }
                    str = str.replaceAll(str.charAt(0) + "", "");
        }
    }
}

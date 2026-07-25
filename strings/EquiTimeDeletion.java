package strings;



public class EquiTimeDeletion {
    final int i=10;
    public static void main(String[] args) {
        remove("aaaabcd","kumarswamy");
        System.out.println();
    }
    public static void remove(String s1, String s2){
        int [] c1 = new  int [26];
        int [] c2 = new  int [26];
        int i=0;
        while(i<s1.length()||i<s2.length()){
            if(i<s1.length()){
                c1[s1.charAt(i)-'a']++;
            }
            if(i<s2.length()){
                c2[s2.charAt(i)-'a']++;
            }
            i++;
        }
        for(i=0;i<c1.length;i++){
            iterate(c1[i],c2[i],i);
        }
    }
    public static void iterate(int i,int j,int k){
       int base=Math.abs(i-j);
       while(base!=0){
           System.out.print((char)(k+'a'));
           base--;
       }
    }
}

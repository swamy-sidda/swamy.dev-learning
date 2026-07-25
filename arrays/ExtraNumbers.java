package arrays;

public class ExtraNumbers {
     static void main(String[] args) {
        String s="000111222220011";
        int j=-1,count=0;
        char ch='0';
        for(;true;){
            if(s.charAt(++j)==ch){
                count++;
                if(count>4) System.out.print(s.charAt(j));
            }
            if(j==s.length()-1){
               // System.out.println("j"+j);
                j=-1;
                count=0;
                ++ch;
               // System.out.println(ch);
                if(ch=='9') break;
            }
        }
    }
}

package strings;

public class LongestNumber {
    static void main() {
        System.out.println(getNumber("kumar-1234-1234"));
    }
    public static String getNumber(String str) {
        String str1="";
        String str2="";
        boolean flag=true;
        int i=0;
        while(str.charAt(i)!=' '){
            i++;
        }
        while(i<str.length()){
           if(str.charAt(i)!='-'){}
        }
        return str2;
    }
}

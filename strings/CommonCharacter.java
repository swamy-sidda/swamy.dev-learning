package strings;

public class CommonCharacter {
    public static void main(String[] args) {
        String s= "kumarswamyKumarswamykumarswamy";
        String s1="kumarswamy" ;
        main1(s,s1);
    }
    public static  void main1(String str,String  s){
        String[] st=checkAssign(str,s);
        str=st[0];
        s=st[1];
        int i=0,j=s.length()-1,k=0;
        while(k<str.length()){
            if(str.charAt(k)==s.charAt(i)){
                System.out.println(s.charAt(i));
                i=0;
                k++;
                continue;
            }
            else {
                i++;
            }
            if(str.charAt(k)==s.charAt(j)){
                System.out.println(s.charAt(j));
                j=s.length()-1;
                k++;
            }
            else {
                if(j==(s.length())/2||i==j){
                  i=0;
                  j=s.length()-1;
                  k++;
                  continue;
                }
                if(j==(s.length())/2||i==j) {
                    i = 0;
                    j = s.length() - 1;
                    k++;
                    continue;
                }
                j--;
            }
        }
    }
    public static String[] checkAssign(String s1,String s2){
     String[] s=new String[2];
     s[0]=s1;
     s[1]=s2;
     if(s1.length()>s2.length()){
        String temp=s[0];
        s[0]=s[1];
        s[1]=temp;
     }
     return s;
    }
}

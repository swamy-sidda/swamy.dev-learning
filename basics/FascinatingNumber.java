package basics;

public class FascinatingNumber {
     static void main(String[] args) {
        int number=192;
        System.out.println(check(192));
        }
        public static boolean check(int number)
        {
            String s=String.valueOf(number);
            int length=s.length();
            int result=1;
            int res=1;
            String str="";
            while(res<=length){
              str+=""+res*number;
              res++;
            }
            String str2="123456789";
            for(int i=0;i<str2.length();i++){
                if(!str.contains(str2.charAt(i)+"")){
                   return false;
                }
            }
            return true;
        }
    }


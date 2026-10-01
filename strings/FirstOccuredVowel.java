package strings;

import java.util.Arrays;

public class FirstOccuredVowel {
     static void main() {
         getString("kumar madanapalli swamy from madanapalli ");
    }
    public static void getString(String str){
         if(str==null){
             System.out.println("Enter String only");
             return;
         }
         int i=0;
         String str1="";
         while(str.charAt(i)==' ')i++;
         while(i<str.length()){
             if(str.charAt(i)==' '){
                 System.out.print(resultString(str1)+" ");
                 str1="";
                 i++;
             }
             else{str1=str1+str.charAt(i++);}
         }
         if(str1!=""){System.out.println(resultString(str1));}
    }
    public static String resultString(String str){
         if(str==" "){return "";}
         char[] arr=str.toCharArray();
         char ch='\u0000';
         for(int i=0;i<arr.length;i++){
             if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='u'||arr[i]=='o'){
                 ch=(char)(arr[i]+1);
                 break;
             }
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='u'||arr[i]=='o')  arr[i]=ch;
         }
         StringBuffer sb=new StringBuffer();
         for(int i=0;i<arr.length;i++)  sb.append(arr[i]);
         return sb.toString();
    }
}

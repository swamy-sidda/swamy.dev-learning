package strings;

import java.util.Arrays;

public class EliminatingExcess {
    public static void main(String[] args) {
       eliminateExcess("aabbccddee1234");
       orderingElements("abcdEFGHIefghiABCD");
    }
    public static void eliminateExcess(String str){
        int[] arr=new int[256];
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==0){
                arr[str.charAt(i)]=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                System.out.print((char)i);
        }
        System.out.println();
    }
    public static void orderingElements(String str){
      char[] arr1=new char[26];
      char[] arr2=new char[26];
      for(int i=0;i<str.length();i++){
          char c=str.charAt(i);
          //System.out.println(str.charAt(i));
         if(c>='a'&&c<='z'){
           arr1[c-'a']=c;
         }
         if(c>='A'&&c<='Z'){
             arr2[c-'A']=c;
         }
      }
      StringBuilder sb=new StringBuilder();
      StringBuilder sb1=new StringBuilder();
      for(int i=0;i<arr1.length;i++){
          if(arr1[i]!=0) sb.append(arr1[i]);
          if(arr2[i]!=0) sb.append(arr2[i]+" ");
         // System.out.println(" ");
      }
      System.out.println(sb);
    }
}

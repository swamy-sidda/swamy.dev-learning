package strings;

public class Permutations {
    public static void main(String[] args) {
      permutation("abc",0,2);
    }
    public static void permutation(String str,int start,int end){
        if(start==end){
            System.out.println(str);
            return;
        }
        for(int i=start;i<=end;i++){
          String temp=swap(str,start,i);
          permutation(temp,start+1,end);
        }
    }
    public static String swap(String str,int i,int j){
        char[]temp=str.toCharArray();
        char temp1=temp[i];
        temp[i]=temp[j];
        temp[j]=temp1;
        return  new String(temp);
    }
}

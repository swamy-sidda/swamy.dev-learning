package strings;

public class CharacterCount {
    public static void main(String[] args) {
        String str="aabbbccddeefghh";
        test3(str);
    }
    public static void  test3(String str1){
        String str=str1.toLowerCase()+" ";
      int i=0;
      int count=1;
      while(i<str.length()-1){
          if(str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
          }
          else{
              System.out.print(str.charAt(i)+""+count);
              i++;
              count=1;
          }
      }
      System.out.println();
    }
}

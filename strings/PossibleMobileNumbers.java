package strings;
public class PossibleMobileNumbers {
    public static void main(String[] args) {
        detect("");
    }
    public static void search(String str) {
        if(str.length()!=10) return ;
        if (str.matches("[6-9]{1}[0-9]{9}")) {
            System.out.println(str);
        }}
    public static void detect(String str) {
        str = findNumbers(str);
        int cons=10;
        for (int i = 0; i < str.length(); i++)
        {
            int j=i+cons;
                if(j==str.length()-1) return;
                search(str.substring(i, j));
        }}
    public static String findNumbers(String str) {
        char[] arr = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {sb.append(arr[i]);}
        }
       return new String(sb.toString());}
}




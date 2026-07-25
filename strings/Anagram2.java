package strings;

public class Anagram2 {
     static void main(String[] args) {
      System.out.println(isAnagram("siilent","liisten"));
    }
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] array=new int[256];

        for (int i = 0; i < a.length(); i++) {
            array[a.charAt(i)]++;
        }
        for (int i = 0; i < b.length(); i++) {
            array[b.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

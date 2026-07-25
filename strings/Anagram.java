package strings;

public class Anagram {
     static boolean anagram(String a, String b) {
        if (a.length() != b.length()) return false;
        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.length() != b.length()) return false;
            {
                char a1 = a.charAt(0);
                a = a.replace(a1 + "", "");
                b = b.replace(a1 + "", "");

            }
        }
            return true;

        }
        public static void main (String[]args){

        System.out.println(anagram("fame", "name"));
        }
    }


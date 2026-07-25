package strings;

public class RomanToNumber {
   public static void main(String[] argss) {
       System.out.println(romanToInt("II"));
    }
    public static int getInteger(Character ch){
       switch(ch){
           case 'I': return 1;
           case 'V': return 5;
           case 'X': return 10;
           case 'L': return 50;
           case 'C': return 100;
           case 'D': return 500;
           case 'M': return 1000;
           default: return 0;
       }
    }
    public static int romanToInt(String roman) {

        if (roman == null || roman.length() == 0)
            return 0;
        int solution = 0;
        int i = 0;
        while (i < roman.length()) {
            int value = getInteger(roman.charAt(i));
            if (i < roman.length() - 1 &&
                    value < getInteger(roman.charAt(i + 1))) {
                solution = solution +
                        getInteger(roman.charAt(i + 1)) - value;
                i += 2;   // skip both characters
            } else {
                solution = solution + value;
                i++;
            }
        }
        return solution;
    }
}

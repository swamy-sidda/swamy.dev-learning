package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateVerification {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("11220181223");
        list.add("21120192312");
        list.add("3120171212");
        list.add("4220161230");
        list.add("5320151230");
        list.add("6420141230");
        list.add("75620131230");
        list.add("8720121230");
        verification1(list);
    }

    public static void verification1(List<String> list){

        String regex = "(0?[1-9]|[12][0-9]|3[01])" +
        "(0?[1-9]|1[0-2])" +
                "(17\\d{2}|18\\d{2}|19\\d{2}|20[0-2]\\d|2030)";

        Pattern pattern = Pattern.compile(regex);

        for (String s : list) {

            Matcher match = pattern.matcher(s);

            while (match.find()) {
                String str = match.group();
                System.out.println("original one is : "+ s+" "+"Matched: " + str);
            }
        }
    }
}

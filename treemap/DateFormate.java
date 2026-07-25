package treemap;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormate {
    public static  boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "first");map.put(2, "second");
        map.put(3, "third");map.put(4, "fourth");
        map.put(5, "fifth");map.put(6, "sixth");map.put(7, "seventh");map.put(8, "eight");
        map.put(9, "ninth");map.put(10, "tength");map.put(11, "eleventh");
        map.put(12, "twelth");map.put(13, "thirteenth");map.put(14, "fourteenth");
        map.put(15, "fifteenth");map.put(16, "sixteenth");map.put(17, "seventeenth");
        map.put(18, "eighteenth");map.put(19, "ninteenth");map.put(20, "twenty");
        map.put(30, "thirty");map.put(40, "fourty");map.put(50, "fify");
        map.put(60, "sixty");map.put(70, "seventy");map.put(80, "eighty");
        map.put(90, "ninty");map.put(100, "hundred");map.put(1000, "thousand");

        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(1, "one");map2.put(2, "two");map2.put(3, "three");
        map2.put(4, "four");map2.put(5, "five");map2.put(6, "six");map2.put(7, "seven");
        map2.put(8, "eight");map2.put(9, "nine");map2.put(10, "ten");
        map2.put(11, "eleven");map2.put(12, "twelve");map2.put(13, "thirteen");
        map2.put(14, "fourteen");map2.put(15, "fifteen");map2.put(16, "sixteen");
        map2.put(17, "seventeen");map2.put(18, "eighteen");map2.put(19, "ninteen");

        TreeMap<Integer, String> map3 = new TreeMap<>();

        map3.put(1, "january");map3.put(2, "february");map3.put(3, "march");
        map3.put(4, "april");map3.put(5, "may");map3.put(6, "june");
        map3.put(7, "july");map3.put(8, "august");map3.put(9, "september");
        map3.put(10, "october");map3.put(11, "november");map3.put(12, "december");

        TreeMap<Integer, Integer> map4 = new TreeMap<>();

        map4.put(1, 31);map4.put(2, 28);map4.put(3, 31);map4.put(4, 30);
        map4.put(5, 31);map4.put(6, 30);map4.put(7, 31);map4.put(8, 31);
        map4.put(9, 30);map4.put(10, 31);map4.put(11, 30);map4.put(12, 31);

        System.out.println("Enter a valid date to format");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        int month = 0;
        int d = 0;
        int year = 0;
        int count = 0;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(date);
        while (m.find()) {
            if (count == 0) {
                d = Integer.parseInt(m.group());
                count = 1;
                continue;
            }
            if (count == 1) {
                month = Integer.parseInt(m.group());
                count = 2;
            } else {
                year = Integer.parseInt(m.group());
            }
        }

        System.out.println("day" + d);
        System.out.println("month" + month);
        System.out.println("year" + year);
        if (month == 2 && d == 29) {
            if (isLeapYear(year)) {
                sb.append(map.get(20));
                sb.append(map.get(9));
                sb.append(" ");
                sb.append(map3.get(2));
                sb.append(" ");
            } else {
                try {
                    throw new InvalidDateException("Month Invalid Exception");
                } catch (InvalidDateException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        } else {
            //month validation
            if (month <= 12 && month > 0) {
                sb2.append(map3.get(month));
                sb2.append(" ");
            } else {
                try {
                    throw new InvalidDateException("Month Invalid Exception");
                } catch (InvalidDateException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }


            //day validation
            if (d <= (int) map4.get(month)) {
                if (map.containsKey(d)) {
                    sb.append(map.get(d));
                    sb.append(" ");
                    sb.append(sb2);
                    sb.append(" ");
                } else {
                    int d1 = d % 10;
                    int d2 = (d / 10) * 10;
                    sb.append(map.get(d2));
                    sb.append(map.get(d1));
                    sb.append(" ");
                    sb.append(sb2);
                    sb.append(" ");
                }
            } else {
                try {
                    throw new InvalidDateException("date Invalid Exception");
                } catch (InvalidDateException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }


        //year validation

        if (year <= 9999 && year > 1000) {
            int temp = year;
            int th = year / 100;
            if (th >= 11 && th <= 19) {
                sb.append(map2.get(th));
                sb.append(map.get(100));
                sb.append(" ");
                if (temp % 100 <= 19 && temp % 100 >= 11) {
                    sb.append(map2.get(temp % 100));
                } else {
                    int t = ((temp % 100) / 10) * 10;
                    sb.append(map.get(t));
                    int t1 = temp % 10;
                    if (map2.containsKey(t1)) {
                        sb.append(map2.get(t1));
                    }
                }
            } else {
                int y = temp / 1000;
                sb.append(map2.get(y));
                sb.append(map.get(1000));
                sb.append(" ");
                int hundred = (temp % 1000) / 100;
                if(hundred != 0){
                sb.append(map2.get(hundred));
               // System.out.println("kumar swamy");
                sb.append(map.get(100));
                sb.append(" ");
            }
            if (temp % 100 <= 19 && temp % 100 >= 11) {
                sb.append(map2.get(temp % 100));
            } else {
                int ten = ((temp % 100) / 10) * 10;
                if (ten != 0) {
                    sb.append(map.get(ten));
                }
                int units = temp % 10;
                if (units != 0) {
                    sb.append(map2.get(units));
                }
            }
        }
    }else{
           try{
               throw new InvalidDateException("year Invalid Exception");
           }catch(InvalidDateException e){
              System.out.println( e.getMessage());
               return;
           }
        }
        System.out.println(sb.toString());
    }
}
class InvalidDateException extends Exception {
    private String msg;
    InvalidDateException(String msg)
    {
        this.msg=msg;
    }
    public String getMessage()
    {
        return "------->"+msg;
    }
}
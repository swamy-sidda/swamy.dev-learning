package arraylist;

import java.util.Arrays;
import java.util.List;

public class TimeToSellAndBuyStock {
     static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//       list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);

        //The above lines are causes to UnsupportedException
        //Because of that we can't insert values int collection by using Arrays asList() as well as by using add() from collection

      Sell_Buy_Stock(list);
    }
    public static void Sell_Buy_Stock(List<Integer> list){
        int minValue=list.get(0);
        int minIndex=0;
        int maxIndex=0;
        int result=0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i)<minValue) {
                minValue = list.get(i);
                minIndex = i;
            }
            int profit = list.get(i)-minValue;
            if (profit > result) {
                result = profit;
                maxIndex = i;
            }
        }
        System.out.println( result+"  "+minIndex+"  "+maxIndex);
    }
}

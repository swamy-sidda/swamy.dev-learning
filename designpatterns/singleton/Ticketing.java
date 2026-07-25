package designpatterns.singleton;

import java.util.Scanner;

public class Ticketing {
     static void main(String[] args) {
       Ticket t=Ticket.getInstance();
       t.getTicket();
    }
}
class Ticket {
    private static Scanner sc = new Scanner(System.in);
    private static Ticket ticket;
    private static float calculate_amt = 0f;
    private static int seats=0;
    private static int total_amount=0;
    private static int km =0;

    private static float price = 1.6f;


    private Ticket() {
    }

    public static Ticket getInstance() {
        if (seats==65) {
            makeEmpty();
           System.out.println("bus is overloaded");
           return null;
        }
        if (ticket == null) {
            ticket = new Ticket();
        }
        return ticket;
    }

    public void  getTicket() {

        float amount=member();
        System.out.println("total cost is "+amount);
        System.out.println("Please pay amount "+ (int)amount);
        System.out.println("Total amount is "+total_amount);
    }

    private static float member() {
        calculate_amt = getOldersPrice()+getChildPrice()+getOYoungsterPrice();
        total_amount += calculate_amt;
        float total=calculate_amt;
        calculate_amt = 0;
        return total;
    }

    private static int calculateDistance(int i,int j) {
        int s1=0;int s2=15;
        if(i==1) s1=0;
        if(i==2) s1=15;
        if(i==3) s1=25;


        if(j==2) s2=15;
        if(j==3) s2=25;
        if(j==4) s2=50;
        return s2-s1;
    }
    private static int getDistance(int stop1, int stop2) {
        int distance = 0;
        if (stop1 < stop2) {
            distance = calculateDistance(stop1, stop2);
        } else {
            distance = 0;
            System.out.println("enter the correct stoppings ");
            System.exit(0);
        }
        return distance;
    }
    private static int getDistance() {
        System.out.print("from 1,2,3 " + " ");
        int stop1 = sc.nextInt();
        System.out.print("to 2,3 ,4 " + " ");
        int stop2 = sc.nextInt();
        System.out.println();
        return getDistance(stop1, stop2);
    }

    public static float getOldersPrice() {
        km = getDistance();
        System.out.println("enter number of old age");
        int person_number = sc.nextInt();
        float cost = Ticket.price * km - ((price * km) * (20 / 100))* person_number;
        seats = seats+ person_number;
        System.out.println(km+" * "+price+" = "+cost);
        return cost;
    }

    public static float getOYoungsterPrice() {
        System.out.println("enter number of youngsters");
        int person_number = sc.nextInt();
        float cost = price * person_number * km;
        seats = seats+ person_number;
        System.out.println(km+" * "+price+" = "+cost);
        return cost;
    }

    public static float getChildPrice() {
        System.out.println("enter number of childers");
        int person_number = sc.nextInt();
        float cost =  price * km-((price * km) * (50 / 100))*person_number;
        seats = seats+ person_number;
        System.out.println(km+" * "+price+" = "+cost);
        return cost;
    }

    public static void makeEmpty() {
        seats=0;
        total_amount=0;
        price = 1.6f;
        km = 0;
        System.out.println("book after bus reached to depot");
    }
}

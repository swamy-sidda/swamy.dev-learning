package arrays.arrays;

class TheaterApp {
    int seats = 100;
    private static TheaterApp object = null;

    private TheaterApp() {
    }

    public static TheaterApp getInstance() {
        if (object == null) {
            object = new TheaterApp();
            return object;
        }
        return object;
    }

    public void bookSeats(int n) {
        if (seats == 0)
            System.out.println("seats are filled already");
        if (seats < n)
            System.out.println("seats available are" + seats);
        else
            seats = seats - n;
        System.out.println(seats - n + " are booked successfully");
    }
}

public class BookMyShowApp {
    public static void main(String ad[]) {
        TheaterApp t =  TheaterApp .getInstance();
        t.bookSeats(20);
        TheaterApp  t1 =  TheaterApp .getInstance();
        t1.bookSeats(30);
        TheaterApp  t3 =  TheaterApp .getInstance();
        t3.bookSeats(20);
        TheaterApp  t2 =  TheaterApp .getInstance();
        t2.bookSeats(30);
        t2.bookSeats(30);
    }
}
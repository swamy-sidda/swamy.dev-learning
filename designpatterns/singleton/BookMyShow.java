package designpatterns.singleton;

class Theater1
{
    int seats=100;
    private static Theater1 object=null;
    private Theater1(){}

    public static Theater1 getInstance()
    {
        if(object==null)
        {
            object =new Theater1();
        }
        return object;
    }
    public void bookSeats(int n)
    {
        if(seats==0)
        {
            System.out.println("seats are filled already");
            seats=100;
        }
        if(seats<n){
            System.out.println("seats available are"+seats);
            System.out.println("Seats are not possible to book at this instance for this many members");
        }
        if(seats>=n){
            seats=seats-n;
            System.out.println(n+" are booked successfully");
        }
    }
}
public class BookMyShow
{
    public static void main(String ad[])
    {

        Theater1 t1=Theater1.getInstance();
        Theater1 t3=Theater1.getInstance();
        Theater1 t2=Theater1.getInstance();
        Theater1 t4=Theater1.getInstance();
        t1.bookSeats(50);
        t2.bookSeats(10);
        t3.bookSeats(20);
        t4.bookSeats(30);
        t2.bookSeats(10);
        t3.bookSeats(10);
        t1.bookSeats(50);
        t4.bookSeats(30);
        t4.bookSeats(30);
    }
}
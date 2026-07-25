package designpatterns.singleton;

 class Theater {
    private static Theater theater;
    int seats=10;
    int bookedSeats=0;
    private Theater(){
    }
    public static Theater getInstance(){
        if(theater == null){
            theater = new Theater();
        }
        return theater;
    }
    public void bookSeats(int n){
      if(n<=seats-bookedSeats){
          bookedSeats+=n;
          System.out.println("Booked Seats: "+bookedSeats);
      }
      else {
          System.out.println(seats-bookedSeats+" seats are available to book ");
      }
    }
}
public class Driver{
      static void main(String[] args) {
         Theater t=Theater.getInstance();
         t.bookSeats(5);
         t.bookSeats(5);
         t.bookSeats(5);
     }
}

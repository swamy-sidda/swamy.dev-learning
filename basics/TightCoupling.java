package basics;

public class TightCoupling {
     static void main(String[] args) {
        Cars car=new Cars();
        Vehicle v=new Vehicle(car);
        v.manufacture(car);
        System.out.println("---------------");
        Boats boat=new Boats();
        Vehicle boat2=new Vehicle(boat);
        boat2.manufacture(boat);
    }
}
class Cars{

}
class Boats{
}
class Engines{
}
class Vehicle{
    Cars car;
    Boats boat;
    public Vehicle(Cars car){
        this.car=car;
    }
    public Vehicle(Boats boat){
        this.boat=boat;
    }

    public void manufacture(Cars car){
        System.out.println("car is manufactured ");
    }
    public void manufacture(Boats boat){
        System.out.println("boat is manufactured ");
    }

}

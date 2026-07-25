package designpatterns.bridge;

public class Diver1 {
    static void main(String[] args) {
      Vehicle vehicle=new Car(new Diesel());
      vehicle.move();
      vehicle=new Car(new Electric());
      vehicle.move();
      vehicle=new Car(new Petrol());
      vehicle.move();
      vehicle=new Bike(new Diesel());
      vehicle.move();
      vehicle=new Bike(new Electric());
      vehicle.move();
    }
}
interface Engine{
    void start();
}
class Petrol implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol engine is started ");
    }
}
class Diesel implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel engine is started ");
    }
}
class Electric implements  Engine{
    @Override
    public void start() {
        System.out.println("Electric engine is started ");
    }
}
abstract class Vehicle {
    protected Engine engine;
    public Vehicle(Engine engine) {
        this.engine = engine;
    }
    public abstract void move();
}
class Car extends Vehicle{
    public Car(Engine engine) {
        super(engine);
    }
    @Override
    public void move() {
        engine.start();
        System.out.println("Car  is moving ");
        System.out.println("--------------------");

    }
}
class Bike extends Vehicle{
    public Bike(Engine engine) {
        super(engine);
    }
    @Override
    public void move() {
        engine.start();
        System.out.println("Bike  is moving ");
        System.out.println("--------------------");

    }
}

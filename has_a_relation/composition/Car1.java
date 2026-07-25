package has_a_relation.composition;

interface Engine1{
    abstract void engine();
}
class PrtrolEngine implements Engine1{
    @Override
    public void engine() {
        System.out.println("Petrol Engine Started");
    }
}
class DeiselEngine implements Engine1{
    @Override
    public void engine() {
        System.out.println("Diesel Engine Started");
    }
}
class ElectricEngine implements Engine1{
    @Override
    public void engine() {
        System.out.println("Electric Engine Started");
    }
}
public class Car1{
    private Engine1 reference;

    Car1(Engine1 engine) {
        this.reference = engine;
    }
    public void drive() {
        reference.engine();
        System.out.println("car is moving");
    }
     static void main(String[] args) {
        Engine1 e=new DeiselEngine();
        Car1 c=new Car1(e);
        c.drive();
        System.out.println("----------------");
        Engine1 e1=new PrtrolEngine();
        Car1 c1=new Car1(e1);
        c1.drive();
        System.out.println("----------------");
        Engine1 e2=new ElectricEngine();
        Car1 c2=new Car1(e2);
        c2.drive();
    }
}
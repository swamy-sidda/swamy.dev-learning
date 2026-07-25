package basics;

public class LooseCoupling {
     static void main(String[] args) {
       Engine engine=new SrteamEngine();
       Car car=new Car(engine);
       car.run();
        System.out.println("-----------------");
       Engine engine2=new PetrolEngine();
       Car car2=new Car(engine);
       car2.run();
    }
}
interface Engine{
    public void start();
}
class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine");
    }
}
class SrteamEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Srteam Engine");
    }
}
class Car{
    Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void run(){
        engine.start();
        System.out.println("Car is running ");
    }
}


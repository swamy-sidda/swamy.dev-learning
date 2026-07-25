package oops;

public class Represent {
    static void main() {
        System.out.println("working perfectly");
        Person p=new Person();

    }
}
interface  Trip{
    void vehicles();
    void members();
    void place();
}
class Person implements Trip{
    @Override
    public void vehicles() {

    }

    @Override
    public void members() {

    }

    @Override
    public void place() {

    }

}

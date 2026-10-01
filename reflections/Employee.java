package reflections;

interface First extends java.io.Serializable, Cloneable, Comparable {}

interface Second extends First {}

class SuperClass implements First {

    public Comparable com;
    private  Second second;
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void SuperMethod1() {}
    public void SuperMethod5() {}
    public void SuperMethod3() {}

    private void SuperMethod2() {}
    private void SuperMethod4() {}
    private void SuperMethod6() {}

}

public class Employee extends SuperClass implements Second {

    private First first;
    private Second second;

    public Employee() {}

    private Employee(First first) {this.first = first;}

    public Employee(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public void publicMethod3() {}
    public void publicMethod1() {}
    public void publicMethod2() {}

    private void privateMethod1() {}
    private void privateMethod2() {}
    private void privateMethod3() {}

    @Override
    public int compareTo(Object o) {return 0;}
}
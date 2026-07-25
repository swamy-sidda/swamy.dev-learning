package scenariosofjava;

public class IsLand_Of_Isolation {
    static void main() {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();

        t1.i=t2;
        t2.i=t3;
        t3.i=t1;

        //now Island of Isolation will be created because of every thing is null

        t2=null;
        t3=null;

        t1=t2;
        t2=t3;
        t3=t1;

        System.out.println("t1==t2==t3==t1==t2==t3");
        System.out.println(t1.i);
        System.out.println(t2.i);
        System.out.println(t3.i);

    }
}
class Test{
    Test i;
}

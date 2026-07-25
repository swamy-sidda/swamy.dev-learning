package innerclasses;

class PopCorn {
    public void taste(){
        System.out.println("salty");
    }
}
public class Ananymous{
     static void main(String[] args) {
        PopCorn pop = new PopCorn()
        {
            public void taste(){
                System.out.println("spicy");
            }
        };
        pop.taste();
        PopCorn pop2 = new PopCorn();
        pop2.taste();//salty
        PopCorn pop3 = new PopCorn()
        {
            public void taste(){
                System.out.println("sweet");
            }
        };
        pop3.taste();
        pop2.taste();
        System.out.println(pop.getClass().getName());
        System.out.println(pop2.getClass().getName());
        System.out.println(pop3.getClass().getName());
    }

}

package has_a_relation.aggregation;

public class Test2 {
     static void main(String[] args) {
     SimCard sm=new SimCard("jio",630142662);
     Mobile m=new Mobile(sm);
     m.show();
     SimCard sm2=new SimCard("Airtel",970476012);
     Mobile m2=new Mobile(sm2);
     m2.show();
    }
}
class Mobile{
    private SimCard card;
    Mobile(SimCard card){
        this.card = card;
    }
    public void show(){
        System.out.println("card network "+card.network);
        System.out.println("card number "+card.number);
    }
}
class SimCard{
    String network;
    long number;
    SimCard(String network,long number){
        this.network = network;
        this.number = number;
    }
}
package comparable;

import java.util.Arrays;

public class Product_Executor
{
    public static void main(String[] prasad)
    {
        Product_Details[] pd=new Product_Details[10];
        pd[0]=new Car("Toyota",12000,"grey");
        pd[1]=new Car("Audi",23000,"red");
        pd[2]=new Car("benz",24000,"white");
        pd[3]=new Bicycle("Appachea",35000,"black");
        pd[4]=new Bicycle("pulsar",21400,"black");
        pd[5]=new Bicycle("bullet",21300,"blue");
        pd[6]=new Cycle("racer",7000,"moon white");
        pd[7]=new Cycle("smarter",2500,"red");
        pd[8]=new Cycle("gamer",2000,"black");
        pd[9]=new Bicycle("splender",2900,"blue");

        Arrays.sort(pd);
        for(Product_Details pp:pd)
        {
            System.out.println(pp);
        }
    }
}
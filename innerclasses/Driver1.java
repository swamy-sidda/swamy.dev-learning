
package innerclasses;

import java.util.LinkedList;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---->|W ");System.out.println("elcome to best selling mal");
        System.out.println("L--->|||||||");
        Supplier sup=new Supplier();
        Supplier.Consumer con=new Supplier().new Consumer();
        sup.product();
        con.details();
    }
}

class Supplier{
    static  LinkedList<String> list=new LinkedList<String>();
    static  LinkedList<Integer> list1=new LinkedList<Integer>();
    Scanner sc=new Scanner(System.in);
    Supplier(){
    }
    public  void product(){
        int counter;
        while(true) {
            System.out.println("Enter  name and cost");
            String name = sc.next();
            int n = sc.nextInt();
            list.add(name);
            list1.add(n);
            System.out.println("-1 if not available else 0");
            Scanner sc1=new Scanner(System.in);
            counter=sc1.nextInt();
            if(counter==-1){
                break;
            }
        }
    }
    class Consumer extends Supplier{
        Consumer(){}
        public void details(){
            int sum=0;
            System.out.println("products and cost details");
            for(int i=0;i<Supplier.list.size();i++){
                System.out.println(Supplier.list.get(i)+" "+Supplier.list1.get(i));
                sum+=Supplier.list1.get(i);
            }
            System.out.println("Total number of products: "+Supplier.list.size());
            System.out.println("Total cost details: "+sum);
        }
    }
}


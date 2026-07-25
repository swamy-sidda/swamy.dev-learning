package designpatterns.composite;

import java.net.Authenticator;
import java.util.ArrayList;

public class Driver1 {
     static void main(String[] args) {
       Category menu =new Category("Drinks");
       Item i=new Item("coco-cola");
       menu.addItem(i);
       i=new Item("Pepsi");
       menu.addItem(i);
       Category hot =new Category("Hot foods");
       i=new Item("biryani");
       hot.addItem(i);
       i=new Item("cheese");
       hot.addItem(i);
       i=new Item("dosa");
       hot.addItem(i);
       Category food =new Category("Ordered");
       food.addItem(menu);
       food.addItem(hot);
       food.showOrder();
     }
}
interface Menu{
    void showOrder();
}
class Item implements Menu{
    String name;
    Item(String name){
        this.name=name;
    }
    @Override
    public void showOrder() {
       System.out.println(name);
    }
}
class Category implements Menu{
    String name;
    private ArrayList<Menu> items=new ArrayList<>();
    Category(String name){
        this.name=name;
    }
    public void addItem(Menu item){
        items.add(item);
    }
    @Override
    public void showOrder() {
        System.out.println(name);
        for(Menu item:items){
            item.showOrder();
        }
    }
}

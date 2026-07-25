package designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public interface LaptopStorage {
     void storage();
}
class USBCardStorage{
    List<String> list=new ArrayList<>();
    public List<String> storePhotos(){
      list.add("kumar");
      list.add("swamy");
      list.add("samay");
      list.add("karan");
      list.add("pranay");
      list.add("kalyan");
      list.add("Tarun kumar");
      List<String> list1=new ArrayList<>();
      list1.addAll(list);
      return list1;
    }
}
class AdapterForLaptopStorage implements LaptopStorage{
    USBCardStorage usbCardStorage;
    List<String> list;
    AdapterForLaptopStorage(USBCardStorage usbCardStorage){
        this.usbCardStorage=usbCardStorage;
    }
    @Override
    public void storage() {
      list= usbCardStorage.storePhotos();
       System.out.println(list);
    }
}

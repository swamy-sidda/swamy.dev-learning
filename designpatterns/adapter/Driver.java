package designpatterns.adapter;

import java.util.Scanner;

public class Driver {
    static void main() {
        Socket socket=new Socket();
        SamsungCharger sd=new SamsungCharger(socket);
        sd.charge();
        SoniCharger sc=new SoniCharger(socket);
        sc.charge();

        System.out.println("----------------------------");

        USBCardStorage usb=new USBCardStorage();
        LaptopStorage store=new AdapterForLaptopStorage(usb);
        store.storage();
    }
}

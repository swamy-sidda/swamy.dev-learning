package designpatterns.decorator;

public class Driver {
    static void main(String[] args) {
      Notification notification=new Email(new SMS(new Basic()));
      notification.sendNotification();
    }
}
interface Notification{
    abstract  void sendNotification();
}
class Basic implements Notification{
    @Override
    public void sendNotification() {
        System.out.println(" sending notification through the platforms");
    }
}
abstract class Decorator implements Notification{
    Notification notification;
    public Decorator(Notification notification) {
        this.notification = notification;
    }
    @Override
    public void sendNotification() {
        notification.sendNotification();
    }
}
class Email extends Decorator{
    public Email(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("Email platform");
    }
}
class SMS extends Decorator{
    public SMS(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("Mobile platform");
    }
}
class WhatsApp extends Decorator{
    public WhatsApp(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("WhatsApp platform");
    }
}

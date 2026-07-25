package designpatterns.abstractfactory;

public class Informationtransformer {
    static void main() {
      NotificationFactory factory=new MailNotification();
      Formatter m=factory.createFormatter();
      Sender s=factory.createSender();
      m.format();
      s.send();

        System.out.println("------------------------------------------------");


        factory=new SMSSenderNotification();
        m=factory.createFormatter();
        s=factory.createSender();
        m.format();
        s.send();


        System.out.println("------------------------------------------------");
        factory=new WhatsAppSenderNotification();
        m=factory.createFormatter();
        s=factory.createSender();
        m.format();
        s.send();
    }
}
interface Sender{
    void send();
}
interface Formatter{
    void format();
}
class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("Mail information is sending ");
    }
}
class MailFormatter implements Formatter{
    @Override
    public void format() {
        System.out.println("Mail information is formatted ");
    }
}
class SMSSender implements Sender{
    @Override
    public void send() {
        System.out.println("SMS information is sending ");
    }
}
class SMSSFormatter implements Formatter{
    @Override
    public void format() {
        System.out.println("SMS information is formatted ");
    }
}
interface NotificationFactory{
    Sender createSender();
    Formatter createFormatter();
}
class MailNotification implements NotificationFactory{
    @Override
    public Sender createSender() {
        return new MailSender();
    }
    @Override
    public Formatter createFormatter() {
        return new MailFormatter();
    }
}
class SMSSenderNotification implements NotificationFactory{
    @Override
    public Sender createSender() {
        return new SMSSender();
    }
    @Override
    public Formatter createFormatter() {
        return new SMSSFormatter();
    }
}
class WhatsAppSender implements Sender{
    @Override
    public void send() {
        System.out.println("WhatsApp information is sending ");
    }
}
class WhatsAppFormatter implements Formatter{
    @Override
    public void format() {
        System.out.println("WhatsApp information is formatted ");
    }
}
class WhatsAppSenderNotification implements NotificationFactory{
    @Override
    public Sender createSender() {
        return new WhatsAppSender();
    }
    @Override
    public Formatter createFormatter() {
        return new WhatsAppFormatter();
    }
}

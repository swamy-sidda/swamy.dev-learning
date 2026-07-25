package designpatterns.adapter;

public interface Charger {
    void charge();
}
class SamsungCharger implements Charger {
    Socket socket;
    public SamsungCharger(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void charge() {
        System.out.println("mobile is charging with "+socket.getVolts() % 60);
    }
}
class SoniCharger implements Charger {
    Socket socket;
    public SoniCharger(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void charge() {
        System.out.println("Moblie is charging with "+socket.getVolts() / 15+" Volts");
    }
}
class Socket{
    public int getVolts(){
      return 220;
    }
}

package innerclasses;

public class IntefaceUsage {
    interface TyreImple{
        public abstract void wheeles();
    }
    class Bus implements TyreImple {
        @Override
        public void wheeles() {
            System.out.println("No of tyres are 7");
        }
    }
        class Lorry implements TyreImple{
            @Override
            public void wheeles() {
                System.out.println("No of tyres are 14");
            }
        }
         static void main(String[] args) {
            IntefaceUsage v = new IntefaceUsage();
            IntefaceUsage.Bus b = new IntefaceUsage().new Bus();
            IntefaceUsage.Lorry l = new IntefaceUsage().new Lorry();
            b.wheeles();
            l.wheeles();
        }
    }


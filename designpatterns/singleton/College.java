package designpatterns.singleton;

public class College
{
    public static void main(String dh[])
    {
        Admissions monday=Admissions.getInstance();
        monday.register(20);
        monday.register(30);
        monday.register(20);
        monday.register(28);
        monday.register(21);
        monday.register(80);
        Admissions tuesday=Admissions.getInstance();
        tuesday.register(20);
    }
}

class Admissions
{
    int seats=100;
    static private Admissions object=null;
    private Admissions(){}
    public static Admissions getInstance()
    {
        if(object==null)
            return object=new Admissions();
        return object;
    }
    public void register(int n)
    {
        if(seats==0){
            System.out.println("seats are not available");
            System.out.println("Ask for management{call method refill()}");
        }
        if(seats>0&&seats<n)
            System.out.println("available seats for this day are "+seats);
        if(seats>n)
        {
            System.out.println("today "+ n +" seats are filled in college");
            seats=seats-n;
        }
    }
    public boolean refill()
    {
        if(seats==0){
            seats=100;
            return true;
        }
        return false;
    }
}
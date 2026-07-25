package comparable;

import java.util.Arrays;

class Jspiders implements Comparable
{
    String std;
    int id;
    String sub;
    static int num=120;
    Jspiders(String st,String sb)
    {
        this.std=st;
        this.sub=sb;
        id=num++;
    }

    public int compareTo(Object arg)
    {
        Jspiders j=(Jspiders) arg;
        return this.sub.compareTo(j.sub);
    }

    public String toString()
    {
        return "Jspiders[name="+std+" subject="+sub+" id="+id+"]";
    }
}

public class Jspiders_Comparable
{
    public static void main(String as[])
    {
        Jspiders[] j= new Jspiders[8];
        j[0]=new Jspiders("kumar","MERN");
        j[1]=new Jspiders("umar","java");
        j[2]=new Jspiders("Amar","MERN");
        j[3]=new Jspiders("Nadan","java");
        j[4]=new Jspiders("bhadra","python");
        j[5]=new Jspiders("sameer","python");
        j[6]=new Jspiders("komal","java");
        j[7]=new Jspiders("satya","python");

        Arrays.sort(j);
        for(Jspiders d:j)
            System.out.println(d);
    }
}


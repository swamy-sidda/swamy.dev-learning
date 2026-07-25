package comparable;

import java.util.Arrays;

class Circle implements Comparable
{
    int radius;
    String model;
    int id;
    private static int num=1011;
    Circle(String m,int r)
    {
        this.model=m;
        this.radius=r;
        id=num++;
    }
    public int compareTo(Object arg)
    {
        Circle c=(Circle)arg;
        if(radius>c.radius) return 1;
        if(radius<c.radius) return -1;
        return 0;
    }
    public String toString()
    {
        return "Circle[ Model="+model+" radius="+radius+" id="+id+"]";
    }
}

public class Circle_Comparable
{
    public static void main(String ar[])
    {
        Circle[] c=new Circle[5];
        c[0]=new Circle("Rider",8);
        c[1]=new Circle("Roar",12);
        c[2]=new Circle("Piyush",10);
        c[3]=new Circle("bull",7);
        c[4]=new Circle("flag",2);

        Arrays.sort(c);
        for(Circle a:c)
            System.out.println(a);

    }
}
















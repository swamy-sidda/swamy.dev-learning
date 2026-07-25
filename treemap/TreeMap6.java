package treemap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

public class TreeMap6
{
    public static void main(String ad[])
    {
        TreeMap<Student,String> m=new TreeMap<>(new MarksComparator());
        m.put(new Student(101,"kumar",99),"pass");
        m.put(new Student(102,"umar",89),"pass");
        m.put(new Student(103,"satya",92),"pass");
        m.put(new Student(104,"sampad",59),"pass");
        m.put(new Student(105,"kiran",69),"pass");
        m.put(new Student(106,"pravali",79),"pass");
        for(Map.Entry<Student,String> c:m.entrySet())
        {
            System.out.println(c);
        }

    }
}
class Student
{
    int roll;
    String name;
    int marks;
    Student(int roll,String name,int marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public String toString()
    {
        return "Student["+roll+" "+name+" "+marks+"]";
    }
}

class MarksComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.marks<=s2.marks) return -1;
        else return 1;
    }
}

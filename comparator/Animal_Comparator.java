package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Animal_Comparator  
{
 public static void main(String ar[])
 {
   AnimalGroup [] a=new AnimalGroup[7];
   a[0]=new AnimalGroup("cat","AP",1234.00);
   a[1]=new AnimalGroup("rat","telangana",1284.00);
   a[2]=new AnimalGroup("sheep","TELANGANA",23234.00);
   a[3]=new AnimalGroup("goat","MP",45634.00);
   a[4]=new AnimalGroup("lion","MP",347834.00);
   a[5]=new AnimalGroup("cheethah","bengal",12634.00);
   a[6]=new AnimalGroup("tiger","BENGAL",78034.00);
 
  Arrays.sort(a,new State_Compare());
  for(AnimalGroup c:a)
   System.out.println(c);

 }
}

class State_Compare implements Comparator
{
  public int compare(Object arg1,Object arg2)
  {
    AnimalGroup a1=(AnimalGroup) arg1;
    AnimalGroup a2=(AnimalGroup) arg2;
  // if(a1.state.length()>a2.state.length()) return 1;
   //if(a1.state.length()<a2.state.length()) return -1;
   //return 0;
  return a1.state.length()-a2.state.length();
  }
}

class AnimalGroup
{
 String name;
 String state;
 double cost;
 AnimalGroup(String n,String s,double b)
  {
   this.state=s;
   this.name=n;
   this.cost=b;
  }
 public String toString()
 {
  return "Animal[Name="+name+" state="+state+" cost= "+cost+"]";
 }
}











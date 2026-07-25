package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JspidersApp
{
 String b_code;
 String b_time;
 String t_name;
 String branch;
  JspidersApp(String c,String t,String tn,String b)
  {
    this.b_code=c;
    this.b_time=t;
    this.t_name=tn;
    this.branch=b;
  }
public String toString()
 {
  return "jspiders[batchcode "+b_code+" time "+b_time+" trainer "+t_name+" branch "+branch+" ]";
 }
}

public class Jspiders_Comparator
{
public static void main(String k[])
 {
   JspidersApp[] a=new JspidersApp[8];
    a[0]=new JspidersApp("1011","9am","raveesh","Marathahalli");
    a[1]=new JspidersApp("1012","12am","rahul","Marathahalli");
    a[2]=new JspidersApp("1014","14pm","ramana","Marathahalli");
    a[3]=new JspidersApp("1016","16pm","dhruva","Marathahalli");
    a[4]=new JspidersApp("1012","9am","kishore","Marathahalli");
    a[5]=new JspidersApp("1010","12am","bharath","Marathahalli");
    a[6]=new JspidersApp("1017","14pm","kumar","Marathahalli");
    a[7]=new JspidersApp("1018","16pm","dinesh","Marathahalli");
  
    Arrays.sort(a,new Time_Compare());
    for(JspidersApp j:a)
    System.out.println(j);  
 }
}


class Time_Compare implements Comparator
{
  public int compare(Object arg1,Object arg2) 
  {
    JspidersApp j1=(JspidersApp) arg1;
    JspidersApp j2=(JspidersApp) arg2;
     
    Pattern p=Pattern.compile("\\d+");
    Matcher m=p.matcher(j1.b_time);
    int s1=0;
    while(m.find())
    {
      s1+=Integer.parseInt(m.group());
    }
    Pattern p1=Pattern.compile("\\d+");
    Matcher m1=p1.matcher(j2.b_time);
    int s2=0;
    while(m1.find())
    {
      s2+=Integer.parseInt(m1.group());
    }
     //if(s1<s2)
      //return -1;
     //if(s1>s2) return 1;
     //return 0;
    return s1-s2; 
  }
}














package linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class LinkedList_Demo
{
  public static void main(String aa[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements to array");
    LinkedList<Integer> al=new LinkedList<>();
    while(true)
    {
     int x=sc.nextInt();
     if(x==-1)
     break; 
     al.add(x); 
    }
    System.out.println("size of Linkedlist is"+al.size());
    System.out.println(al);

    Collections.sort(al);
    System.out.println("sorted Linkedlist is "+al);
  }
}
package arraylist;

class ArrayList_Implementation
{
  private int pointer=0;
  private int[] array;
ArrayList_Implementation()
   {
    array=new int[10];
   } 
ArrayList_Implementation(int n)
   {
    array=new int[n];
   }     
  public void add(int a)
 {
   if(pointer>=array.length)
   {
    int[] temp=new int[((pointer*3)/2)+1];
    for(int i=0;i<array.length;i++)
    {
     temp[i]=array[i];
    }
    array=temp;
   }
  array[pointer++]=a;
 }
public int get(int index)
{
 if(index<0||index>=array.length)
 {
   throw new ArrayIndexOutOfBoundsException();
 }
  return array[index];
} 
public int size()
{
 return pointer;
}
public boolean remove(int index)
{
 if(index<0||index>=array.length)
 {
   throw new ArrayIndexOutOfBoundsException();
 }
  array[index]=0;
  return true;
} 
}




public class Implementation_User
{
public static void main(String fa[])
{
 ArrayList_Implementation ai=new ArrayList_Implementation();
 ai.add(10); 
 ai.add(20);
 ai.add(30); 
 ai.add(40);
 ai.add(50); 
 ai.add(60);
 ai.add(70); 
 ai.add(80);

System.out.println("before removing the elements");
 for(int i=0;i<ai.size();i++)
 System.out.print(ai.get(i)+" ");
 
 System.out.println();
 System.out.println(ai.get(7));
 System.out.println(ai.get(6));

 
 
System.out.println();
 
 ai.remove(5);
 ai.remove(4);

System.out.println("after removing the elements");
 for(int i=0;i<ai.size();i++)
 System.out.print(ai.get(i)+" ");
 
}
}






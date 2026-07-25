package arraylist;

public class ArrayList_Implementation1
{
  private int pointer=0;
  private int[] array;
 public ArrayList_Implementation1()
   {
    array=new int[10];
   } 
public ArrayList_Implementation1(int n)
   {
    array=new int[n];
   }     
  public void add(int a)
 {
   if(pointer>=array.length) increaseArraySize();
   array[pointer++]=a;
 }
private void increaseArraySize()
{
   int[] temp=new int[((pointer*3)/2)+1];
    for(int i=0;i<array.length;i++)
    {
     temp[i]=array[i];
    }
    array=temp;
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
public void remove(int index)
{
 if(index<0||index>=size())
 {
   throw new ArrayIndexOutOfBoundsException();
 }
  for(int i=size()-1;i>=index;i--)
  {
    array[i-1]=array[i];
  }
   pointer--;
  } 
public void add(int index,int element)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
 if(pointer>=size()) increaseArraySize();
  for(int i=size();i>index;i--)
  {
   array[i]=array[i-1];
  }
  array[index]=element;
  pointer++;
}
public String toString()
{
 if(pointer==0) return "[]";
 String s="["+array[0];
 for(int i=1;i<size();i++)
 {
   s+=","+array[i];
 }
  s+="]";
  return s;
}
}










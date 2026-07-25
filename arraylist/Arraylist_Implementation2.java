package arraylist;

public class Arraylist_Implementation2
{
  int count=0;
  Object[] array;
 public Arraylist_Implementation2()
  {
    array=new Object[10];
  }
private void increaseArraySize()
{
 Object[] temp=new Object[(count*5)/2];
    for(int i=0;i<array.length;i++)
   {
     temp[i]=array[i];
   }
   array=temp;
}
 
public void add(Object e)
{
  if(count>=array.length) increaseArraySize();
  array[count++]=e;
}
public int size()
{
  return count;
}

public void remove(int index)
{
 if(index<=-1||index>=size())
 {
  throw new ArrayIndexOutOfBoundsException();
 }
 for(int i=index+1;i<size();i++)
 {
  array[i-1]=array[i];
 }
  count--;
}
public void add(int index,Object e)
{
 if(index<=-1||index>=size())  throw new ArrayIndexOutOfBoundsException();
 if(count>=size()) increaseArraySize(); 
 for(int i=size()-1;i>=index;i--)
 array[i+1]=array[i];
 array[index]=e;
}

 public String toString()
  {
    if(count==0) return "[]";
   String s="["+array[0];
   for(int i=1;i<size();i++)
   {
    s+=","+array[i];
   }
   s+="]";
   return s;
  }
 public void clear()
 {
  array=new Object[10];
  count=0; 
}
}
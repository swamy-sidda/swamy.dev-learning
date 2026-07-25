package arrays.arrays;

class Counting_Chars
{
    public static void main(String fg[])
    {
        int a[]={12,32,12,32,23,23,23,33,33,32,32,43,45,45,45};
        for(int i=0;i<a.length;i++)
        {
            int index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[index])
                {
                    index=j;
                }
            }
            if(i!=index)
            {
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
        System.out.println();

    }
}

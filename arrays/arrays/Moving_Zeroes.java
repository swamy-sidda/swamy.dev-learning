package arrays.arrays;

class Moving_Zeroes
{
     void main(String ad[])
    {
        int[] a={0,1,0,2,10,20,30,0,0,40,0,50,0,70,0,90};
        int j=a.length-1,i=0;
        while(i<j)
        {
            while(a[i]!=0)i++;
            while(a[j]==0)j--;
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}


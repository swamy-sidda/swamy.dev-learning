package arrays.arrays;

public class Count_Occurence
{
    public static void main(String kl[])
    {
        int[] a={12,12,34,54,34,54,54,54,43,43};

        for(int i=0;i<a.length-1;i++)
        {
            int count=0;
            if(a[i]=='\u0000') continue;
            int s=a[i];
            for(int j=a.length-1;j>=i;j--)
            {
                if(a[j]=='\u0000') continue;
                if(a[j]==a[i])
                {
                    count++;
                    a[j]='\u0000';

                }
            }
            System.out.println(s+" "+count);
            count=0;
        }
    }
}
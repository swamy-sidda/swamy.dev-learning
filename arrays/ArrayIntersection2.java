package arrays;

public class ArrayIntersection2 {
     static void main(String[] asd)
    {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={5,6,7,8,9};
      iterateArrary(a,b);
    }
    public static void iterateArrary(int[] a,int[] b)
    {
        int i=0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                System.out.print( a[i]+" ");
                i++;j++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println();
        System.out.println("process completed successfully");
    }
}

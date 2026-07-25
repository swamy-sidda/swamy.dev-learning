package arrays;

public class Intersection {
     static void main(String sf[]){
       int[] a={1,2,3,4,5,6,7,8,9};
       int[] b={5,6,7,8,9};
       arrayIterator(a,b);
    }
    public static void arrayIterator(int[] a,int[] b)
    {
       for(int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){
               if(a[i]==b[j]){
                   System.out.print(a[i]+" ");
               }
           }
       }
       System.out.println();
    }
}

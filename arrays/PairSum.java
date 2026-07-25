package arrays;

public class PairSum {
     static void main(String[] args) {
      int[] a={0,1,2,3,4,5,6,7,8,9};
        isPairSum(a,13);
    }
    public static  void isPairSum(int[] a,int n){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==n){
                System.out.println(a[i]+" "+a[j]);
                i++;
                j--;
            }
            if(sum>n){
               j--;
            }
            if(sum<n){
                i++;
            }
        }
    }
}

package twodimensional;

public class SecondMin {
    static void main() {
        int[][] a={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
      SecondMin.iterate(a);
      System.out.println("completed");
    }
    public static void iterate(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            int j=arr[0].length-1;
            kumar:
            if(j>=0) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
                j--;
                continue;
            }
            System.out.println(max);
            System.out.println("completed");
        }
    }
}

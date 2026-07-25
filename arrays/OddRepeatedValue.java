package arrays;

public class OddRepeatedValue {
    static void main() {
        int[] arr={1,1,3,3,3,1,1,1};
        oddRepeated(arr);
    }
    public static void oddRepeated(int[] arr){
        int count[]= new int[10];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int odd=0;
        int re=0;
        for(int i=0;i<count.length;i++){
            if(count[i]%2!=0){
                if(odd<count[i]){
                    odd=count[i];
                    re=i;
                }
            }
        }
        System.out.println("odd times repeated value "+re+", "+odd+" times repeated ");
    }
}

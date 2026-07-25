package arrays;

public class ArrayDuplicates2 {
    static void main(String[] args) {
        int[] array={1,2,3,4,5,1,2,3,4,5};
        System.out.println(array[0]);
        for(int i=1;i<array.length;i++){
            int j=i-1;
            while(j>=0){
                if(array[j]==array[i]) break;
                j--;
            }
            if(j==-1)
                System.out.println(array[i]);
        }
    }
}

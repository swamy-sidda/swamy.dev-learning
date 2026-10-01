package arrays;

public class BinaryArray {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        System.out.println(traverseArray(arr));
    }

    public static int traverseArray(int[] arr) {
        boolean flag = true;
        int count1 = 0;
        int count = 0;
        int i = 1;
        int target = arr[0];
        while (i < arr.length - 1) {
            if (arr[i] != target && arr[i] <= 1) {
                ++count;
                target = arr[i];
                ++i;
                continue;
            } else if (arr[i] == target) {
                if (flag == true) {
                    flag = false;
                    i++;
                    continue;
                }
                if (count1 < count) {
                    count1 = count;
                    i--;
                    target = arr[i - 1];
                    count = 0;
                    continue;
                }
                target = arr[i++];
                count = 0;

            }
        }
        if (count > count1) {
            count1 = count;
        }
        return count1 + 1;
    }

}

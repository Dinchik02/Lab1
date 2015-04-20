package Lab1;

import java.time.Duration;
import java.util.Arrays;

public class BubbleSorter {
 
    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = arr.length - 2; index >= barrier; index--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }



    public static void main(String[] args) {
        long before, after;
        before = System.nanoTime();
        sort(new int[] {3,2,5,4,1,9,6,8,7});
        after = System.nanoTime();
        System.out.println(Duration.ofNanos(after - before));
    }
}

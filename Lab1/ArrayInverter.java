package Lab1;

import java.util.Arrays;

public class ArrayInverter {
    public static void invert(int[] arr) {
    	System.out.println("Массив до инверсии:" +Arrays.toString(arr));
        for (int k = 0; k < arr.length / 2; ++k) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
          
        }
        System.out.println("Массив после инверсии от начала:" +Arrays.toString(arr));
    }

/*необходимо переписать цикл с инкремента счетчика от 0 до середины массива 
 * на цикл от середины массива до 0 (инкремент (k++) 
 * заменить на декремент (k--)).*/
 

public static void myinvert(int[] arr) {
	System.out.println("Массив до инверсии:" +Arrays.toString(arr));
    for (int k = arr.length / 2 -1; k >= 0; --k) {
        int tmp = arr[k];
        arr[k] = arr[arr.length - k - 1];
        arr[arr.length - k - 1] = tmp;
        
    	}
    System.out.println("Массив после инверсии от центра:" +Arrays.toString(arr));
	}
	public static void main (String[] args) {
		invert(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		myinvert(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
	} 
}

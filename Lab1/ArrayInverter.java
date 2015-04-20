package Lab1;

import java.util.Arrays;

public class ArrayInverter {
    public static void invert(int[] arr) {
    	System.out.println("������ �� ��������:" +Arrays.toString(arr));
        for (int k = 0; k < arr.length / 2; ++k) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
          
        }
        System.out.println("������ ����� �������� �� ������:" +Arrays.toString(arr));
    }

/*���������� ���������� ���� � ���������� �������� �� 0 �� �������� ������� 
 * �� ���� �� �������� ������� �� 0 (��������� (k++) 
 * �������� �� ��������� (k--)).*/
 

public static void myinvert(int[] arr) {
	System.out.println("������ �� ��������:" +Arrays.toString(arr));
    for (int k = arr.length / 2 -1; k >= 0; --k) {
        int tmp = arr[k];
        arr[k] = arr[arr.length - k - 1];
        arr[arr.length - k - 1] = tmp;
        
    	}
    System.out.println("������ ����� �������� �� ������:" +Arrays.toString(arr));
	}
	public static void main (String[] args) {
		invert(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		myinvert(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
	} 
}

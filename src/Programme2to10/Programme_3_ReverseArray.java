package Programme2to10;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        obj.reverseArray();
    }

    public void reverseArray() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] revArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[arr.length - i - 1] = arr[i];
        }
        System.out.println("Original Array " + Arrays.toString(arr));
        System.out.println("Reversed Array " + Arrays.toString(revArr));
    }
}

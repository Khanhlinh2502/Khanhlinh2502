
import java.util.Arrays;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            int[] array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            System.out.println("Original Array: " + Arrays.toString(array));

            reverseArray(array);

            System.out.println("Reversed Array: " + Arrays.toString(array));
        }

        public static void reverseArray(int[] array) {
            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }
}

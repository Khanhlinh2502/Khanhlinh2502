import java.util.Arrays;
import java.util.Scanner;
public class Ex4 {
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

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array)
                     .distinct()
                     .toArray();
    }
}


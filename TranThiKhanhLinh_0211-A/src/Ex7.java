 import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            int[] array = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int largest = array[0];
            int secondLargest = array[0];

            for (int i = 1; i < n; i++) {
                if (array[i] > largest) {
                    secondLargest = largest;
                    largest = array[i];
                } else if (array[i] > secondLargest && array[i] < largest) {
                    secondLargest = array[i];
                }
            }

            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}


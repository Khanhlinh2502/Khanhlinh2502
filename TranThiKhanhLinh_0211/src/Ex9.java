
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Need at least 2 numbers.");
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];
        int secondSmallest = numbers[1];

        if (secondSmallest < smallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < size; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Second smallest: " + secondSmallest);
    }
}

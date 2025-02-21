
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] frequency = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            frequency[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            if (frequency[i] == 0) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        frequency[j] = -1;
                    }
                }
                frequency[i] = count;
            }
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < size; i++) {
            if (frequency[i] > 0) {
                System.out.println(numbers[i] + ": " + frequency[i] + " times");
            }
        }
    }
}

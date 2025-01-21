
import java.util.Random;


public class Ex6 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
            if (numbers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.print("Generated Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }
}

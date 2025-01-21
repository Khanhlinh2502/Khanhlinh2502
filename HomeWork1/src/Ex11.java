
import java.util.ArrayList;
import java.util.Random;

public class Ex11 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Max: " + max + ", Min: " + min);
    }
}

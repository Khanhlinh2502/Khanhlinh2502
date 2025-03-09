import java.util.ArrayList;
import java.util.Random;
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        numbers.remove(3);
        System.out.println(numbers);
    }
}

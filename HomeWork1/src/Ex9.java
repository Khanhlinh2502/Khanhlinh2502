
import java.util.ArrayList;

public class Ex9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(8);
        numbers.add(15);

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

        System.out.println("Largest Element: " + max);
        System.out.println("Smallest Element: " + min);
    }
}

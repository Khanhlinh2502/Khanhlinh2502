
import java.util.ArrayList;

public class Ex7 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        ArrayList<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        System.out.println("Reversed List: " + reversedNumbers);
    }
}

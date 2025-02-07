
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String oldWord = scanner.nextLine();
        String newWord = scanner.nextLine();
        System.out.println(text.replace(oldWord, newWord));
    }
}

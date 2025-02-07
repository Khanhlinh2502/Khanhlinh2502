import java.util.Scanner;
public class Ex5 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String text = scanner.nextLine();
        char character = scanner.next().charAt(0);
        System.out.println(text.length() - text.replaceAll(String.valueOf(character), "").length());
    }
}

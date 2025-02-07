import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine().trim();
        String[] words = text.split("\\s+");
        System.out.println("The number of words in the string is: " + words.length);
            }
}

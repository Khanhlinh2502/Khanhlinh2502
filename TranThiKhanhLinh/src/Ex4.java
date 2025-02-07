import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String text = scanner.nextLine().trim().replaceAll("\\s+", " ");
        System.out.println("String after removing extra spaces: " + text);

    }
    
}

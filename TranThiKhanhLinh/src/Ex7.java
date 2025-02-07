import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    String number = text.replaceAll("\\D+", " ");
    System.out.print(number.trim());
}
}

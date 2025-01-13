import java.util.Scanner;
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            System.out.println("The sides form a valid triangle");
            
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isoscele");
            } else {
                System.out.println("The triangle is scalene");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        scanner.close();
    }
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}


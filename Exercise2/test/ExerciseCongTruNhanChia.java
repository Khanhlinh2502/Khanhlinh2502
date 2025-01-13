import java.util.Scanner;
public class ExerciseCongTruNhanChia {
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b; 
    }
    public static int multilication(int a, int b){
        return a*b;
    }
    public static double division(int a,int b){
        return (double) a/b;
    }
    public static int modulus (int a, int b){
        return a%b;
    }
    public static void main(String[] agrs){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap a: ");
    int a = scanner.nextInt();
    System.out.print("Nhap b: ");
    int b = scanner.nextInt();
    System.out.println("Addtion: "+addition(a,b));
    System.out.println("Subtraction: "+subtraction(a,b));
    System.out.println("Multilication: "+multilication(a,b));
    System.out.println("Division: "+division(a,b));
    System.out.println("Modulus: "+modulus(a,b));
    }
    
    
}

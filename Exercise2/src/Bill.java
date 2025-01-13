import java.util.Scanner;
public class Bill {
    public static void main(String[] args){
    Scanner scanner  = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int kWh= scanner.nextInt();
    double totalCost;
    if (kWh <= 50) {
        totalCost = kWh * 1678;
    } else if (kWh <= 100) {
        totalCost = 50 * 1678 + (kWh - 50) * 1734;
    } else if (kWh <= 200) {
        totalCost = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
    } else {
        totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 200) * 2536;
        }
    System.out.print("Bill: "+totalCost);
}
}

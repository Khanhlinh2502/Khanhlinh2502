import java.util.Scanner;
public class DetermineTheDayTheWeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n= scanner.nextInt();
        switch(n){
            case 7: System.out.println("Thu bay");break;
            case 6: System.out.println("Thu sau");break;
            case 5: System.out.println("Thu nam");break;
            case 4: System.out.println("Thu tu");break;
            case 3: System.out.println("Thu ba");break;
            case 2: System.out.println("Thu hai");break;
            case 1: System.out.println("Chu nhat");break;
        }
    }
    
}

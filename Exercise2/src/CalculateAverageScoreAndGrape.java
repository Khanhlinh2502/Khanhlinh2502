import java.util.Scanner;
public class CalculateAverageScoreAndGrape {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Math score: ");
    int a = scanner.nextInt();
    System.out.println("Input Physics score: ");
    int b = scanner.nextInt();
    System.out.println("Input Chemmistry score: ");
    int c = scanner.nextInt();
    double number = (a+b+c)/3;
    if(number>=8){
        System.out.println("Excenlent");
    }else if(number>6.5&& number<8){
         System.out.println("Good");
    }else if(number>5 && number<6.5){
         System.out.println("Average");
    }else if (number<5){
        System.out.println("Poor");
    }
}
}

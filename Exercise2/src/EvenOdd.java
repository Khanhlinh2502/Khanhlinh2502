import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Input a: ");
    int a = scanner.nextInt();
    if(a%2==0){
    System.out.print(a+ " is an even");
}else{
    System.out.print(a+ " is an odd");
}
    
}
}

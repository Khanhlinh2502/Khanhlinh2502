import java.util.Scanner;
public class LargesOfThree {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a: ");
    int a = scanner.nextInt();
    System.out.print("Input b: ");
    int b = scanner.nextInt();
    System.out.print("Input c: ");
    int c = scanner.nextInt();
    int largest;
    if(a>c&&a>b){
        largest=a;
    }else if(b>a&&b>c){
        largest=b;
    }else{
        largest=c;
    }
    System.out.print("The largest number is "+largest);
}
}

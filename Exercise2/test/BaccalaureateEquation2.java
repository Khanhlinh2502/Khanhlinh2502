

import java.util.Scanner;
public class BaccalaureateEquation2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a: ");
    int a = scanner.nextInt();
    System.out.print("Input b: ");
    int b = scanner.nextInt();
    System.out.print("Input c: ");
    int c = scanner.nextInt();
    int delta = b*b-4*a*c;
    if(delta < 0 ){
        System.out.print("Phuong trinh vo nghiem ");
    }else if ( delta ==0 ){
        System.out.print("x1 = x2 "+ -b/(2*a));
    }
    else{
         System.out.println("x1 = "+ (-b + Math.sqrt(a)) / ( 2*a));
         System.out.println("x2 = "+ (-b - Math.sqrt(a)) / ( 2*a));
  
    
} }
}

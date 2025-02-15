
package Exercise2;
import java.util.Scanner;
import java.util.ArrayList;
abstract class Animal {
     String id;
    String source;
    String dateOfBirth;
    String color;

    public Animal(String id, String source, String dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Source: " + source);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Color: " + color);
    }
}

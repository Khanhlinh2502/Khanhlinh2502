
package Exercise2;
import java.util.Scanner;
public class Processsor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalList animalList = new AnimalList();
        int choice;

        do {
            System.out.println("0. Exit");
            System.out.println("1. Add a Dog");
            System.out.println("2. Add a Cat");
            System.out.println("3. Display all animals");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Dog ID: ");
                    String dogId = scanner.nextLine();
                    System.out.print("Enter Source: ");
                    String dogSource = scanner.nextLine();
                    System.out.print("Enter Date of Birth: ");
                    String dogDob = scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String dogColor = scanner.nextLine();
                    animalList.addAnimal(new Dog(dogId, dogSource, dogDob, dogColor));
                    break;
                case 2:
                    System.out.print("Enter Cat ID: ");
                    String catId = scanner.nextLine();
                    System.out.print("Enter Source: ");
                    String catSource = scanner.nextLine();
                    System.out.print("Enter Date of Birth: ");
                    String catDob = scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String catColor = scanner.nextLine();
                    System.out.print("Enter Breed: ");
                    String catBreed = scanner.nextLine();
                    animalList.addAnimal(new Cat(catId, catSource, catDob, catColor, catBreed));
                    break;
                case 3:
                    animalList.displayAll();
                    break;
                default:
                    if (choice != 0) System.out.println("Invalid option, try again.");
            }
        } while (choice != 0);
    }
}

package Exercise4;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Edit Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Hometown: ");
                    String studentHomeTown = scanner.nextLine();
                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String studentDOB = scanner.nextLine();
                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();
                    personList.addPerson(new Student(studentId, studentHomeTown, studentDOB, major));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Enter Hometown: ");
                    String teacherHomeTown = scanner.nextLine();
                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String teacherDOB = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    personList.addPerson(new Teacher(teacherId, teacherHomeTown, teacherDOB, department));
                    break;
                case 3:
                    System.out.print("Enter ID to edit: ");
                    String editId = scanner.nextLine();
                    personList.editPersonById(editId);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    if (personList.deletePersonById(deleteId)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 5:
                    personList.displayAll();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }
}

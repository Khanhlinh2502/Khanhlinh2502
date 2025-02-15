package Exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String studentId;
    String fullName;
    Date dateOfBirth;
    String major;
    float gpa;

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentId = scanner.nextLine();

        System.out.print("Enter Full Name: ");
        fullName = scanner.nextLine();

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }

        System.out.print("Enter Major: ");
        major = scanner.nextLine();

        System.out.print("Enter GPA: ");
        gpa = scanner.nextFloat();
    }

    public void editStudentById(String idToEdit) {
        Scanner scanner = new Scanner(System.in);
        if (this.studentId.equals(idToEdit)) {
            System.out.print("Enter Full Name: ");
            fullName = scanner.nextLine();

            System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
            String dateOfBirthString = scanner.nextLine();
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                dateOfBirth = sdf.parse(dateOfBirthString);
            } catch (ParseException e) {
                System.out.println("Invalid.");
            }

            System.out.print("Enter Major: ");
            major = scanner.nextLine();

            System.out.print("Enter GPA: ");
            gpa = scanner.nextFloat();
        } else {
            System.out.println("N/A");
        }
    }

    public void displayStudentInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + sdf.format(dateOfBirth));
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}

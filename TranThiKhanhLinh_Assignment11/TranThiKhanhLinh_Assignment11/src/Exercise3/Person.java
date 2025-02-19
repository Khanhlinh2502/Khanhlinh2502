package Exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Person {

    protected String id;
    protected String homeTown;
    protected Date dateOfBirth;

    public Person(String id, String homeTown, String dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + id);
        System.out.println("Hometown: " + homeTown);
        System.out.println("Date of Birth: " + sdf.format(dateOfBirth));
    }
}

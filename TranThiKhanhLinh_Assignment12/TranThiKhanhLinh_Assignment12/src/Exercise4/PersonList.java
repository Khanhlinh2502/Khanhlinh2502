
package Exercise4;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class PersonList {
     ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public boolean deletePersonById(String idToDelete) {
        Person personToDelete = findPersonById(idToDelete);
        if (personToDelete != null) {
            people.remove(personToDelete);
            return true;
        }
        return false;
    }

    public Person findPersonById(String id) {
        for (Person person : people) {
            if (person.id.equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Person person : people) {
            person.displayInfo();
            System.out.println("----------------");
        }
    }

    public void editPersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new Hometown: ");
            person.homeTown = scanner.nextLine();
            System.out.print("Enter new Date of Birth (dd/MM/yyyy): ");
            String dateStr = scanner.nextLine();
            try {
                person.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
            }
        } else {
            System.out.println("Person not found!");
        }
    }
}


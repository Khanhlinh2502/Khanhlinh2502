
import java.util.ArrayList;
import java.util.HashSet;

public class Ex10 {

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();

            names.add("Anna");
            names.add("Bob");
            names.add("Charlie");
            names.add("Anna");
            names.add("David");
            names.add("Bob");

            HashSet<String> uniqueNames = new HashSet<>(names);
            names.clear();
            names.addAll(uniqueNames);

            System.out.println("List without duplicates: " + names);
        }
    }


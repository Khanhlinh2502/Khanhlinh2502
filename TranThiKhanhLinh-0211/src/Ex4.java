
import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Los Angeles");
        cities.add("Sydney");
        cities.add("London");
        cities.add("Toronto");
        cities.add("Madrid");

        boolean containsLondon = cities.contains("London");

        System.out.println("Does the list contain London? " + containsLondon);
    }
}

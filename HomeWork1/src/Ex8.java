
import java.util.ArrayList;

public class Ex8 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Strawberry");

        ArrayList<String> copiedFruits = new ArrayList<>(fruits);

        System.out.println("Original Fruit List: " + fruits);
        System.out.println("Copied Fruit List: " + copiedFruits);
    }
}

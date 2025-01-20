import java.util.ArrayList;
public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(15.75);
        prices.add(8.99);
        prices.add(22.50);
        prices.add(4.20);
        prices.add(18.30);

        System.out.println("Prices of products:");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Price " + (i + 1) + ": $" + prices.get(i));
        }
    }
}

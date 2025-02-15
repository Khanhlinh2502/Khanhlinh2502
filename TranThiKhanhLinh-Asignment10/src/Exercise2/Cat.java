
package Exercise2;
public class Cat extends Animal {
    String breed;

    public Cat(String id, String source, String dateOfBirth, String color, String breed) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

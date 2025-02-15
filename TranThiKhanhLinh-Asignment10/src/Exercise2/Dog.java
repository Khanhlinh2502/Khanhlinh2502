
package Exercise2;
public class Dog extends Animal {
    public Dog(String id, String source, String dateOfBirth, String color) {
        super(id, source, dateOfBirth, color);
    }
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

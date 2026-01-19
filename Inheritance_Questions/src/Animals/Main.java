package Animals;

public class Main {
    public static void main(String[] args) {
        
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Cat("Whiskers", 2),
            new Bird("Tweety", 1)
        };

        System.out.println("=== Animal Sounds ===");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

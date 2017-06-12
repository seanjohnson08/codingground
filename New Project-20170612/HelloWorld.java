import java.util.concurrent.ThreadLocalRandom;

public class HelloWorld{
     public static void main(String []args) {
        Animal animal;
        
        switch (ThreadLocalRandom.current().nextInt(0, 3)) {
            case 0:
                animal = new Dog();
                break;
            case 1:
                animal = new Cat();
                break;
            case 2:
                animal = new Parrot();
                break;
            default:
                throw new Error("Invalid choice");
        }
        
        
        System.out.println(animal.speak());
     }
}
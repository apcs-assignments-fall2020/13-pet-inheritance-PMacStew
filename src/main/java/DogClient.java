import java.util.Scanner;
public class DogClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet pet1 = new Pet("John", 15);
        System.out.print("Enter dogs name: ");
        String name = scan.next();
        System.out.print("Enter dogs age: ");
        int age = scan.nextInt();
        System.out.print("Enter dogs breed: ");
        String breed = scan.next();
        Dog dog1 = new Dog(name, age, breed);
        System.out.println(dog1.toString());
        dog1.makeNoise();
        pet1.makeNoise();
    }
}
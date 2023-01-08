import java.util.Scanner;

public class DogDdemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дайте команду собаке: ");

        String name = scanner.nextLine();

        Dog dog = new Dog ("HotDog", "Brown",7);
        dog.sayYourName();
        dog.sayYourColor();
        dog.sayYourAge();

    }
}

package zoomain;

import java.util.Scanner;

public class ZooMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of animal (Eagle, Penguin, Shark, Goldfish):");
        String animalType = scanner.nextLine();

        Animal animal = createAnimal(animalType);

        if (animal != null) {
            performActivity(animal);
        } else {
            System.out.println("Invalid animal type.");
        }

        scanner.close();
    }

    public static Animal createAnimal(String animalType) {
        return switch (animalType.toLowerCase()) {
            case "eagle" -> new Eagle("Golden Eagle", "Golden");
            case "penguin" -> new Penguin("Emperor Penguin", "Black and White");
            case "shark" -> new Shark("Great White Shark", "Gray");
            case "goldfish" -> new Goldfish("Goldie", "Gold");
            default -> null;
        };
    }

    public static void performActivity(Animal animal) {

        animal.performActivity();
    }
}

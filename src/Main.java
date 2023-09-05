import Enums.HerbivoresTypes;
import fabricMethod.Abstractions.AnimalsCreator;
import fabricMethod.Abstractions.HerbivoresCreator;
import fabricMethod.Abstractions.PredatorsCreator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем Волка");
        AnimalsCreator animalsCreator = new PredatorsCreator();
        System.out.print(animalsCreator.displayMassage());
        animalsCreator.createAnimal();

        System.out.println();
        System.out.println("Создаем Овцу");
        HerbivoresCreator herbivoresCreator = new HerbivoresCreator();
        System.out.print(herbivoresCreator.displayMassage());
        herbivoresCreator.createAnimal();

        System.out.println();
        System.out.println("Создаем Мышь");
        System.out.print(animalsCreator.displayMassage());
        herbivoresCreator.createAnimal(HerbivoresTypes.MOUSE);

        System.out.println();
        System.out.println("Создаем кролика");
        System.out.print(animalsCreator.displayMassage());
        herbivoresCreator.createAnimal(HerbivoresTypes.RABBIT);
    }
}

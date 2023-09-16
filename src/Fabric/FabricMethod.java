package Fabric;

import Enums.HerbivoresTypes;
import Enums.PredatorsTypes;

public class FabricMethod {
//    List<AnimalsCreator> animals = new ArrayList<>();
    public FabricMethod run() {
        AnimalsCreator animalsCreator = new HerbivoresCreator();
        HerbivoresCreator herbivoresCreator = new HerbivoresCreator();
        PredatorsCreator predatorsCreator = new PredatorsCreator();

        System.out.println("Создаем Мышь");
        System.out.print(animalsCreator.displayMassage());
        herbivoresCreator.createAnimal(HerbivoresTypes.MOUSE);


        System.out.println("Создаем Овцу "+ HerbivoresTypes.SHEEP);
        System.out.print(animalsCreator.displayMassage());
        herbivoresCreator.createAnimal(HerbivoresTypes.SHEEP);

        System.out.println("Создаем Волка " );
        System.out.print(animalsCreator.displayMassage());
        predatorsCreator.createAnimal(PredatorsTypes.WOLF);


        System.out.println("Создаем Медведя");
        System.out.print(animalsCreator.displayMassage());
        predatorsCreator.createAnimal(PredatorsTypes.BEAR);

        return null;
    }



}

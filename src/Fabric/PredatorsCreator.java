package Fabric;

import Animals.Animals;
import Animals.Herbivores.Mouse;
import Animals.Herbivores.Sheep;
import Animals.Predators.Bear;
import Animals.Predators.Wolf;
import Enums.AnimalTypes;
import Enums.HerbivoresTypes;
import Enums.PredatorsTypes;

public class PredatorsCreator extends AnimalsCreator {
    @Override
    public Animals createAnimal() {
        return null;
    }

    @Override
    public Animals createAnimal(AnimalTypes types) {

        Animals predators = null;

        switch ((PredatorsTypes) types) {
            case WOLF -> predators = new Wolf(50,30,3,8);
            case BEAR -> predators = new Bear(500,5,2,80);
//            case PYTHON -> herbivores = new Python(15,30,1,3);
//            case FOX -> herbivores = new Fox(8,30,2,2);
//            case EAGLE -> herbivores = new Eagle(6,20,3,1);


        }
        return predators;
    }
}

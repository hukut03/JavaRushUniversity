package fabricMethod.Abstractions;

import Animals.Herbivares.*;
import Animals.Predators.Wolf;
import Enums.AnimalTypes;
import Enums.HerbivoresTypes;
import Interfaces.Animals;

public class HerbivoresCreator extends AnimalsCreator {
    @Override
    public Animals createAnimal() {
        return null;

    }

    @Override
    public Animals createAnimal(AnimalTypes types) {
        Animals herbivores = null;
        switch ((HerbivoresTypes) types) {
            case MOUSE -> herbivores = new Mouse();
            case RABBIT -> herbivores = new Rabbit();
            case BOAR -> herbivores = new Boar();
            case BUFFALO -> herbivores = new Buffalo();
            case DEER -> herbivores = new Deer();
            case DUCK -> herbivores = new Duck();
            case CATERPILLAR -> herbivores = new Caterpillar();
            case GOAT -> herbivores = new Goat();
            case HORSE -> herbivores = new Horse();
            case SHEEP -> herbivores = new Sheep();
        }
        return herbivores;
    }
}

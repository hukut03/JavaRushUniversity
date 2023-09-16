package Fabric;

import Animals.Animals;
import Enums.AnimalTypes;

public abstract class AnimalsCreator {
    public abstract Animals createAnimal();

    public abstract Animals createAnimal(AnimalTypes types);

    public String displayMassage() {
        return "Это животное: " ;
    }
}

package fabricMethod.Abstractions;

import Enums.AnimalTypes;
import Interfaces.Animals;

public abstract class AnimalsCreator {
    public abstract Animals createAnimal();

    public abstract Animals createAnimal(AnimalTypes types);

    public String displayMassage() {
        return "This animal is: ";
    }
}

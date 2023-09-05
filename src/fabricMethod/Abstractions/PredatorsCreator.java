package fabricMethod.Abstractions;

import Animals.Herbivares.Sheep;
import Animals.Predators.*;
import Enums.AnimalTypes;
import Enums.PredatorTypes;
import Interfaces.Animals;

import java.beans.beancontext.BeanContextServiceRevokedEvent;

public class PredatorsCreator extends AnimalsCreator {
    @Override
    public Animals createAnimal() {
        return null;
    }
    @Override
    public Animals createAnimal(AnimalTypes types) {
        Animals predators = null;
        switch ((PredatorTypes) types) {
            case FOX -> predators = new Fox();
            case BEAR -> predators = new Bear();
            case SNAKE -> predators = new Snake();
            case WOLF -> predators = new Wolf();
            case EAGLE -> predators = new Eagle();
        }
        return predators;
    }
}

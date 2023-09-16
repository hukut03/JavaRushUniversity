package Fabric;

import Animals.Animals;
import Animals.Herbivores.Mouse;
import Animals.Herbivores.Sheep;
import Enums.AnimalTypes;
import Enums.HerbivoresTypes;

import java.util.ArrayList;
import java.util.List;

public class HerbivoresCreator extends AnimalsCreator {
    @Override
    public Animals createAnimal() {
        return null;
    }

    @Override
    public Animals createAnimal(AnimalTypes types) {

        
        Animals herbivores = null;

        switch ((HerbivoresTypes) types) {
            case MOUSE -> herbivores = new Mouse(0.05,500,1,0.01);
            case SHEEP -> herbivores = new Sheep(70,140,3,10);

/*a
            case RABBIT -> herbivores = new Rabbit(2,150,2,0.45);
            case BOAR -> herbivores = new Boar(400,50,2,50);
            case BUFFALO -> herbivores = new Buffalo(700,10,3,100);
            case DEER -> herbivores = new Deer(300,20,4,50);
            case DUCK -> herbivores = new Duck(1,200,4,0.15);
            case CATERPILLAR -> herbivores = new Caterpillar(0.01,1000,0,0);
            case GOAT -> herbivores = new Goat(60,140,3,10);
            case HORSE -> herbivores = new Horse(400,20,4,60);
*/


        }
        return herbivores;
    }
}

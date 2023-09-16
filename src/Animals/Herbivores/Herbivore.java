package Animals.Herbivores;

import Animals.Animals;
import Plants.Plant;

public class Herbivore extends Animals {


    public Herbivore(double weight, int maxCountPerLocation, int maxMoveSpeed, double foodRequired) {
        super(weight, maxCountPerLocation, maxMoveSpeed, foodRequired);
    }

    public void eat(Plant food) {
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

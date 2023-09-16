package Animals.Herbivores;

import Fabric.HerbivoresCreator;
import Plants.Plant;

public class Sheep extends Herbivore {

    @Override
    public String toString() {
        return "Я Овца";
    }

    public Sheep(double weight, int maxCountPerLocation, int maxMoveSpeed, double foodRequired) {
        super(weight, maxCountPerLocation, maxMoveSpeed, foodRequired);
    }

    @Override
    public void eat(Plant food) {
        super.eat(food);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void reproduce() {
        super.reproduce();
    }

    @Override
    public void die() {
        super.die();
    }
}

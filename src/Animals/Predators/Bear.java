package Animals.Predators;

public class Bear extends Predators{

    // Не понимаю, почему не работает вывод toString при создании объекта через PredatorsType.BEAR.toString ???
//    @Override
//    public String toString() {
//        return "Bear{}";
//    }

    public Bear(double weight, int maxCountPerLocation, int maxMoveSpeed, double foodRequired) {
        super(weight, maxCountPerLocation, maxMoveSpeed, foodRequired);
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

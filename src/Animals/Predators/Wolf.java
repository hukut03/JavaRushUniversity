package Animals.Predators;

public class Wolf extends Predators {
public void voice(){
    System.out.println("Волк нахуй");
}
    @Override
    public String toString() {
        return "Wol";
    }

    public Wolf(double weight, int maxCountPerLocation, int maxMoveSpeed, double foodRequired) {
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

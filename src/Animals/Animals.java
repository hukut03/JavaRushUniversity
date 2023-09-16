package Animals;
import Food.Food;
import Interfaces.Alive;
import Interfaces.Eatable;
import Island.Location;


public abstract class Animals implements Alive, Eatable {


    private double weight; // Вес животного, кг
    private int maxCountPerLocation; // Максимальное количество животных этого вида на одной локации
    private int maxMoveSpeed; // Скорость перемещения, клеток за ход
    private double foodRequired; // Количество килограммов пищи для полного насыщения

    public Animals(double weight, int maxCountPerLocation, int maxMoveSpeed, double foodRequired) {
        this.weight = weight;
        this.maxCountPerLocation = maxCountPerLocation;
        this.maxMoveSpeed = maxMoveSpeed;
        this.foodRequired = foodRequired;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxCountPerLocation() {
        return maxCountPerLocation;
    }

    public int getMaxMoveSpeed() {
        return maxMoveSpeed;
    }

    public double getFoodRequired() {
        return foodRequired;
    }
    // Метод выбора направления передвижения
    public abstract void move();

    // Метод покушать
    public abstract void eat();

    // Метод размножения
    public abstract void reproduce();
    // Метод вызывающий смерть
    public abstract void die();

}

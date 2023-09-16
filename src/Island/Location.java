package Island;

import Animals.Animals;
import Food.Food;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private int x;
    private int y;
    private List<Animals> animals;
    private List<Food> plants;


    public Location(int x, int y, List<Animals> animals, List<Food> plants) {
        this.x = x;
        this.y = y;
        this.animals = animals;
        this.plants = plants;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public List<Food> getPlants() {
        return plants;
    }

    public void setPlants(List<Food> plants) {
        this.plants = plants;
    }
}

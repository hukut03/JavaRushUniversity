package Food;

public class Food {
    private String name;
    private boolean edible;

    public Food(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    public String getName() {
        return name;
    }

    public boolean isEdible() {
        return edible;
    }
}
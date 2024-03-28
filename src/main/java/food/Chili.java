package food;

public class Chili extends Decorator {
    public Chili(Food newFood) {
        super(newFood);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Chili";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

package food;

public class Cheese extends Decorator {
    public Cheese(Food newFood) {
        super(newFood);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

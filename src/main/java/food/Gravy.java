package food;

public class Gravy extends Decorator {
    public Gravy(Food newFood) {
        super(newFood);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Gravy";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

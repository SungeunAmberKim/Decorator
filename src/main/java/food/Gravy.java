package food;

public class Gravy extends Decorator {
    public Gravy(Food newFry) {
        super(newFry);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Gravy";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

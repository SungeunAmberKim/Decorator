package food;

public class ChiliDog extends Decorator {
    public ChiliDog(Food newHotDog) {
        super(newHotDog);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Chili";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

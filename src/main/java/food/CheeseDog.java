package food;

public class CheeseDog extends Decorator {
    public CheeseDog(Food newHotDog) {
        super(newHotDog);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

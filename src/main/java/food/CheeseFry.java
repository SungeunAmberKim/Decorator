package food;

public class CheeseFry extends Decorator {
    public CheeseFry(Food newFry) {
        super(newFry);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }
}

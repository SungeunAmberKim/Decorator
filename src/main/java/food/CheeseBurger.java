package food;

public class CheeseBurger extends Decorator{
    public CheeseBurger(Food newBurger) {
        super(newBurger);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempFood.getCost() + 0.5;
    }

}

package food;

public class ExtraPatty extends Decorator{
    public ExtraPatty(Food newBurger) {
        super(newBurger);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Patty";
    }
    public double getCost() {
        return tempFood.getCost() + 1.5;
    }

}

package food;

public class Patty extends Decorator{
    public Patty(Food newFood) {
        super(newFood);
    }
    public String getDescription() {
        return tempFood.getDescription() + ", Patty";
    }
    public double getCost() {
        return tempFood.getCost() + 1.5;
    }

}

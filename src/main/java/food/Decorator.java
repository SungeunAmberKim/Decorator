package food;

abstract public class Decorator implements Food {
    protected Food tempFood;
    public Decorator(Food newFood) {
        tempFood = newFood;
    }
    public String getDescription() {
        return tempFood.getDescription();
    }
    public double getCost() {
        return tempFood.getCost();
    }
}

package food;

abstract public class BurgerDecorator implements Food {
    protected Food tempBurger;
    public BurgerDecorator (Food newBurger) {
        tempBurger = newBurger;
    }
    public String getDescription() {
        return tempBurger.getDescription();
    }
    public double getCost() {
        return tempBurger.getCost();
    }
}

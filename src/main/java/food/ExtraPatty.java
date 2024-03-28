package food;

public class ExtraPatty extends BurgerDecorator{
    public ExtraPatty(Food newBurger) {
        super(newBurger);
    }
    public String getDescription() {
        return tempBurger.getDescription() + ", Patty";
    }
    public double getCost() {
        return tempBurger.getCost() + 1.5;
    }

}

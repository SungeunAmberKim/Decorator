package burgers;

public class CheeseBurger extends BurgerDecorator{
    public CheeseBurger(Burger newBurger) {
        super(newBurger);
    }
    public String getDescription() {
        return tempBurger.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempBurger.getCost() + 0.5;
    }

}

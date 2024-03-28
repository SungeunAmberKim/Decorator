package burgers;

public class BasicBurger implements Burger {
    @Override
    public String getDescription() {
        return "Bun, Patty";
    }
    @Override
    public double getCost() {
        return 4.00;
    }
}

package food;

public class BasicBurger implements Food {
    @Override
    public String getDescription() {
        return "Bun, Patty";
    }
    @Override
    public double getCost() {
        return 4.00;
    }
}

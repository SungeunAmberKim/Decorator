package food;

public class BasicFry implements Food {
    @Override
    public String getDescription() {
        return "French fries";
    }
    @Override
    public double getCost() {
        return 2.00;
    }
}

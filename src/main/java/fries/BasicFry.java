package fries;

public class BasicFry implements Fry {
    @Override
    public String getDescription() {
        return "French fries";
    }
    @Override
    public double getCost() {
        return 2.00;
    }
}

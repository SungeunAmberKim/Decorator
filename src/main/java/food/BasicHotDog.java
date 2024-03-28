package food;

public class BasicHotDog implements Food {
    @Override
    public String getDescription() {
        return "Bun, Sausage";
    }
    @Override
    public double getCost() {
        return 3.0;
    }
}

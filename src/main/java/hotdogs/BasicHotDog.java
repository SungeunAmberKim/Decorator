package hotdogs;

public class BasicHotDog implements HotDog {
    @Override
    public String getDescription() {
        return "Bun, Sausage";
    }
    @Override
    public double getCost() {
        return 3.0;
    }
}

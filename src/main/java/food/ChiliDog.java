package food;

public class ChiliDog extends HotDogDecorator {
    public ChiliDog(Food newHotDog) {
        super(newHotDog);
    }
    public String getDescription() {
        return tempHotDog.getDescription() + ", Chili";
    }
    public double getCost() {
        return tempHotDog.getCost() + 0.5;
    }
}

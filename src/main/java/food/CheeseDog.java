package food;

public class CheeseDog extends HotDogDecorator {
    public CheeseDog(Food newHotDog) {
        super(newHotDog);
    }
    public String getDescription() {
        return tempHotDog.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempHotDog.getCost() + 0.5;
    }
}

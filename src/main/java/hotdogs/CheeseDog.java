package hotdogs;

public class CheeseDog extends HotDogDecorator{
    public CheeseDog(HotDog newHotDog) {
        super(newHotDog);
    }
    public String getDescription() {
        return tempHotDog.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempHotDog.getCost() + 0.5;
    }
}

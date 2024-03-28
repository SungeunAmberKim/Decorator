package food;

abstract public class HotDogDecorator implements Food {
    protected Food tempHotDog;
    public HotDogDecorator (Food newHotDog) {
        tempHotDog = newHotDog;
    }
    public String getDescription() {
        return tempHotDog.getDescription();
    }
    public double getCost() {
        return tempHotDog.getCost();
    }
}

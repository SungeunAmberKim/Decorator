package hotdogs;

abstract public class HotDogDecorator implements HotDog {
    protected HotDog tempHotDog;
    public HotDogDecorator (HotDog newHotDog) {
        tempHotDog = newHotDog;
    }
    public String getDescription() {
        return tempHotDog.getDescription();
    }
    public double getCost() {
        return tempHotDog.getCost();
    }
}

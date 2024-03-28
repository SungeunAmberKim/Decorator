package food;

abstract public class FryDecorator implements Food{
    protected Food tempFry;
    public FryDecorator (Food newFry) {
        tempFry = newFry;
    }
    public String getDescription() {
        return tempFry.getDescription();
    }
    public double getCost() {
        return tempFry.getCost();
    }
}

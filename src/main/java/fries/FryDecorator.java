package fries;

abstract public class FryDecorator implements Fry{
    protected Fry tempFry;
    public FryDecorator (Fry newFry) {
        tempFry = newFry;
    }
    public String getDescription() {
        return tempFry.getDescription();
    }
    public double getCost() {
        return tempFry.getCost();
    }
}

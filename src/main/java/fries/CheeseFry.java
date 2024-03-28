package fries;

public class CheeseFry extends FryDecorator{
    public CheeseFry(Fry newFry) {
        super(newFry);
    }
    public String getDescription() {
        return tempFry.getDescription() + ", Cheese";
    }
    public double getCost() {
        return tempFry.getCost() + 0.5;
    }
}

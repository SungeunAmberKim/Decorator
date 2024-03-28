package fries;

public class Gravy extends FryDecorator{
    public Gravy(Fry newFry) {
        super(newFry);
    }
    public String getDescription() {
        return tempFry.getDescription() + ", Gravy";
    }
    public double getCost() {
        return tempFry.getCost() + 0.5;
    }
}

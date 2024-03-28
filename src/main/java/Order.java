public class Order {
    private String description;
    private Double cost;

    public Order() {
        this.description = "";
        this.cost = 0.0;
    }

    public String getDescription() {
        return this.description;
    }
    public double getCost() {
        return this.cost;
    }
    public String toString() {
        return this.description;
    }
}

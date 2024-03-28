import java.util.HashMap;

public class Customer {
    private String name;
    private HashMap<String, Order> order;
    private Loyalty status;


    public Customer(String name) {
        this.name = name;
        this.order = new HashMap<>();
        this.status = new Loyalty();
    }
    public String getName() {
        return this.name;
    }
    public void addOrder(String name, String food) {
        this.order.put(name, new Order(food));
        this.status.addPts();
    }
    public void addTopping(String name, String topping) {
        this.order.get(name).addOn(topping);
    }
    public double getCost() {
        double cost = 0;
        for(Order each: this.order.values()) {
            cost += each.getCost();
        }
        cost = cost - cost* status.discountRate();

        return cost;
    }
    public int orderSize() {
        return this.order.size();
    }
    public void print() {
        System.out.println("Total cost: " + this.getCost());
        System.out.println("Description: ");
        this.order.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}

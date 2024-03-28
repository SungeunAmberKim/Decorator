import food.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    private String name;
    private HashMap<String, Order> order;
    private int points;

    public Customer(String name) {
        this.name = name;
        this.order = new HashMap<>();
        this.points = 0;
    }
    public String getName() {
        return this.name;
    }
    public void addPoints() {
        this.points = this.points + 1;
    }
    public int getPoints() {
        return this.points;
    }
    public void addOrder(String food) {
        this.order.put(food, new Order(food));
        this.addPoints();
    }
    public void addTopping(String food, String topping) {
        this.order.get(food).addOn(topping);
    }
    public double getCost() {
        double cost = 0;
        for(Order each: this.order.values()) {
            cost += each.getCost();
        }
        return cost;
    }











}

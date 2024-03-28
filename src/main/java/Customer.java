import food.*;

import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Order> order;
    private int points;

    public Customer(String name) {
        this.name = name;
        this.order = new ArrayList<>();
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
    public ArrayList<Order> getOrder() {
        return this.order;
    }
    public void addOrder(String food) {
        this.order.add(new Order(food));
        this.addPoints();
    }











}

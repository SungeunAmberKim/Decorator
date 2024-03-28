import food.*;

import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Food> order;
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
    public ArrayList<Food> getOrder() {
        return this.order;
    }
    public void addOrder(String food) {
        String newFood = food.trim().toLowerCase();
        if(newFood.equals("hotdog")) {
            this.order.add(new BasicHotDog());
        } else if(newFood.equals("fry")) {
            this.order.add(new BasicFry());
        } else if(newFood.equals("burger")) {
            this.order.add(new BasicBurger());
        } else {
            return;
        }
        this.addPoints();
    }
    public void addOn() {

    }










}

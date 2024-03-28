import food.*;
public class Order {
    private Food food;

    public Order(String item) {
        String newFood = item.trim().toLowerCase();
        if(newFood.equals("hotdog")) {
            this.food =  new BasicHotDog();
        } else if(newFood.equals("fry")) {
            this.food = new BasicFry();
        } else if(newFood.equals("burger")) {
            this.food = new BasicBurger();
        }
    }
    public double getCost() {
        return this.food.getCost();
    }
    public void addOn(String toppings) {
        String topping = toppings.trim().toLowerCase();
        if(topping.equals("cheese")) {
            this.food = new Cheese(this.food);
        } else if(topping.equals("chili")) {
            this.food = new Chili(this.food);
        } else if(topping.equals("gravy")) {
            this.food = new Gravy(this.food);
        } else if(topping.equals("patty")) {
            this.food = new Patty(this.food);
        }
    }
    public String toString() {
        return this.food.getDescription();
    }

}

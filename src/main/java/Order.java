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
    public void addOn() {

    }

}

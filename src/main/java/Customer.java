public class Customer {
    private String name;
    private Order order;
    private int points;

    public Customer(String name) {
        this.name = name;
        this.order = new Order();
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




}

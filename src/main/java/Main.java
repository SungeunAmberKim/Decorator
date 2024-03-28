import food.*;

public class Main {
    public static void main(String[] args) {
        Food order = new BasicBurger();
        Customer uni = new Customer("Uni");

        uni.addOrder("fry");
        uni.addTopping("fry","cheese");
        System.out.println(uni.getCost());
        uni.addOrder("hotdog");
        uni.addTopping("hotdog","cheese");
        System.out.println(uni.getCost());
    }

}

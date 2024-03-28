import food.*;

public class Main {
    public static void main(String[] args) {
        // creating new customer
        Customer a = new Customer("Uni");
        // customer adding orders
        a.addOrder("breakfast","fry");
        a.addOrder("lunch", "hotdog");
        a.addOrder("dinner", "burger");
        a.addOrder("snack1","fry");
        a.addOrder("snack2","fry");
        a.addOrder("snack3","fry");
        a.addOrder("snack4","fry");
        a.addOrder("snack5","fry");

        // customer adding toppings for different orders
        a.addTopping("breakfast","chili");
        a.addTopping("breakfast","cheese");

        a.addTopping("lunch","gravy");
        a.addTopping("lunch","cheese");

        a.addTopping("dinner","patty");
        a.addTopping("dinner","gravy");

        // printing total cost and description
        // the total cost is calculated after the loyalty points applied to
        a.print();
    }

}

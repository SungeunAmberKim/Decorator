import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer a = new Customer("Uni");

    @Test
    public void testGetName() {
        String expected = "Uni";
        String actual = a.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testAddOrder() {
        int expected = 1;
        a.addOrder("1","fry");
        int actual = a.orderSize();
        assertEquals(expected, actual);
    }
    @Test
    public void testAddOrder2() {
        int expected = 2;
        a.addOrder("1","fry");
        a.addOrder("2","hotdog");
        int actual = a.orderSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCost() {
        double expected = 2.5;
        a.addOrder("1","fry");
        a.addTopping("1", "cheese");
        double actual = a.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetCost2() {
        double expected = 5.5;
        a.addOrder("1","fry");
        a.addTopping("1", "cheese");
        a.addOrder("2","hotdog");
        double actual = a.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testLoyaltyPts() {
        double expected = 19.8;
        a.addOrder("1","fry");
        a.addOrder("2","fry");
        a.addOrder("3","fry");
        a.addOrder("4","fry");
        a.addOrder("5","fry");
        a.addOrder("6","fry");
        a.addOrder("7","fry");
        a.addOrder("8","fry");
        a.addOrder("9","fry");
        a.addOrder("10","fry");
        a.addOrder("11","fry");

        double actual = a.getCost();
        assertEquals(expected, actual);
    }







}

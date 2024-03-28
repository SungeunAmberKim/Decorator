import food.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    Food baseBurger = new BasicBurger();
    Food cheeseBurger = new CheeseBurger(new BasicBurger());
    Food cheesePattyBurger = new ExtraPatty(new CheeseBurger(new BasicBurger()));

    @Test
    public void testBasicBurgerDescription() {
        String expected = "Bun, Patty";
        String actual = baseBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testBasicBurgerCost() {
        double expected = 4.0;
        double actual = baseBurger.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseDescription() {
        String expected = "Bun, Patty, Cheese";
        String actual = cheeseBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseCost() {
        double expected = 4.5;
        double actual = cheeseBurger.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheesePattyDescription() {
        String expected = "Bun, Patty, Cheese, Patty";
        String actual = cheesePattyBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheesePattyCost() {
        double expected = 6.0;
        double actual = cheesePattyBurger.getCost();
        assertEquals(expected, actual);
    }



}

import food.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    Food baseBurger = new BasicBurger();
    Food cheeseBurger = new Cheese(baseBurger);
    Food pattyCheeseBurger = new Patty(cheeseBurger);
    Food gravyPattyCheeseBurger = new Gravy(pattyCheeseBurger);
    Food chiliGravyPattyCheeseBurger = new Chili(gravyPattyCheeseBurger);

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
        String actual = pattyCheeseBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheesePattyCost() {
        double expected = 6.0;
        double actual = pattyCheeseBurger.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testgravyCheesePattyDescription() {
        String expected = "Bun, Patty, Cheese, Patty, Gravy";
        String actual = gravyPattyCheeseBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testGravyCheesePattyCost() {
        double expected = 6.5;
        double actual = gravyPattyCheeseBurger.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliGravyCheesePattyDescription() {
        String expected = "Bun, Patty, Cheese, Patty, Gravy, Chili";
        String actual = chiliGravyPattyCheeseBurger.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliGravyCheesePattyCost() {
        double expected = 7.0;
        double actual = chiliGravyPattyCheeseBurger.getCost();
        assertEquals(expected, actual);
    }



}

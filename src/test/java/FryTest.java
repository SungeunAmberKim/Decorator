import fries.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FryTest {
    Fry base = new BasicFry();
    Fry cheese = new CheeseFry(new BasicFry());
    Fry cheeseGravy = new Gravy(new CheeseFry(new BasicFry()));

    @Test
    public void testBasicFryDescription() {
        String expected = "French fries";
        String actual = base.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testBasicFryCost() {
        double expected = 2.0;
        double actual = base.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseFryDescription() {
        String expected = "French fries, Cheese";
        String actual = cheese.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseFryCost() {
        double expected = 2.5;
        double actual = cheese.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseGravyFryDescription() {
        String expected = "French fries, Cheese, Gravy";
        String actual = cheeseGravy.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseGravyFryCost() {
        double expected = 3.0;
        double actual = cheeseGravy.getCost();
        assertEquals(expected, actual);
    }
}

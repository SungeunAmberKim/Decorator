import food.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FryTest {
    Food fry = new BasicFry();
    Food cheeseFry = new Cheese(fry);
    Food chiliCheeseFry = new Chili(cheeseFry);
    Food gravyChiliCheeseFry = new Gravy(chiliCheeseFry);
    Food pattyGravyChiliCheeseFry = new Patty(gravyChiliCheeseFry);

    @Test
    public void testBasicFryDescription() {
        String expected = "French fries";
        String actual = fry.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testBasicFryCost() {
        double expected = 2.0;
        double actual = fry.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseFryDescription() {
        String expected = "French fries, Cheese";
        String actual = cheeseFry.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseFryCost() {
        double expected = 2.5;
        double actual = cheeseFry.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseFryDescription() {
        String expected = "French fries, Cheese, Chili";
        String actual = chiliCheeseFry.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseGravyFryCost() {
        double expected = 3.0;
        double actual = chiliCheeseFry.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testGravyChiliCheeseFryDescription() {
        String expected = "French fries, Cheese, Chili, Gravy";
        String actual = gravyChiliCheeseFry.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testGravyChiliCheeseFryCost() {
        double expected = 3.5;
        double actual = gravyChiliCheeseFry.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testPattyGravyChiliCheeseFryDescription() {
        String expected = "French fries, Cheese, Chili, Gravy, Patty";
        String actual = pattyGravyChiliCheeseFry.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testPattyGravyChiliCheeseFryCost() {
        double expected = 5.0;
        double actual = pattyGravyChiliCheeseFry.getCost();
        assertEquals(expected, actual);
    }
}

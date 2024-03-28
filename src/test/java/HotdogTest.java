import food.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HotdogTest {
    Food baseDog = new BasicHotDog();
    Food cheeseDog = new Cheese(baseDog);
    Food chiliCheeseDog = new Chili(cheeseDog);
    Food gravyChiliCheeseDog = new Gravy(chiliCheeseDog);
    Food pattyGravyChiliCheeseDog = new Patty(gravyChiliCheeseDog);
    @Test
    public void testBasicHotDogDescription() {
        String expected = "Bun, Sausage";
        String actual = baseDog.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testBasicHotDogCost() {
        double expected = 3.0;
        double actual = baseDog.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese";
        String actual = cheeseDog.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseHotDogCost() {
        double expected = 3.5;
        double actual = cheeseDog.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese, Chili";
        String actual = chiliCheeseDog.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseHotDogCost() {
        double expected = 4.0;
        double actual = chiliCheeseDog.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testGravyChiliCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese, Chili, Gravy";
        String actual = gravyChiliCheeseDog.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testGravyChiliCheeseHotDogCost() {
        double expected = 4.5;
        double actual = gravyChiliCheeseDog.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testPattyGravyChiliCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese, Chili, Gravy, Patty";
        String actual = pattyGravyChiliCheeseDog.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testPattyGravyChiliCheeseHotDogCost() {
        double expected = 6.0;
        double actual = pattyGravyChiliCheeseDog.getCost();
        assertEquals(expected, actual);
    }



}

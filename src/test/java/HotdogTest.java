import food.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HotdogTest {
    Food basic = new BasicHotDog();
    Food cheese = new CheeseDog(new BasicHotDog());
    Food chiliCheese = new ChiliDog(new CheeseDog(new BasicHotDog()));

    @Test
    public void testBasicHotDogDescription() {
        String expected = "Bun, Sausage";
        String actual = basic.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testBasicHotDogCost() {
        double expected = 3.0;
        double actual = basic.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese";
        String actual = cheese.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testCheeseHotDogCost() {
        double expected = 3.5;
        double actual = cheese.getCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseHotDogDescription() {
        String expected = "Bun, Sausage, Cheese, Chili";
        String actual = chiliCheese.getDescription();
        assertEquals(expected, actual);
    }
    @Test
    public void testChiliCheeseHotDogCost() {
        double expected = 4.0;
        double actual = chiliCheese.getCost();
        assertEquals(expected, actual);
    }


}

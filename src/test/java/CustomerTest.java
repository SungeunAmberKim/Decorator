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
    public void testGetPoints() {
        int expected = 0;
        int actual = a.getPoints();
        assertEquals(expected, actual);
    }
    @Test
    public void testAddPoints() {
        int expected = 1;
        a.addPoints();
        int actual = a.getPoints();
        assertEquals(expected, actual);
    }



}

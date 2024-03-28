import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({BurgerTest.class, FryTest.class, HotdogTest.class})
public class CompleteUnitTest {
}
import static org.junit.Assert.*;
import org.junit.*;

public class BooleanReturnerTest {
  @Test
  void testReturnTrue() {
    assertTrue("Should return true", BooleanReturner.returnTrue());
  }
}

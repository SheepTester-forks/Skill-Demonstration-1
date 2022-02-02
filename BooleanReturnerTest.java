import static org.junit.Assert.*;
import org.junit.*;

public class BooleanReturnerTest {
  @Test
  public void testReturnTrue() {
    assertTrue("Should return true", BooleanReturner.returnTrue());
  }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class computeAddTest {
    @Test
    void computeAddTest() {
        AddCompution computation = new AddCompution();
        Assertions.assertEquals(6, computation.compute(1, 5));
        Assertions.assertEquals(16, computation.compute(10, 6));
        Assertions.assertEquals(4, computation.compute(-1, 5));
    }
}

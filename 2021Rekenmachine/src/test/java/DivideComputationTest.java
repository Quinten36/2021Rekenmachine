import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideComputationTest {

    @Test
    public void divideTest()
    {
        DivideComputation d = new DivideComputation();
        Assertions.assertEquals(10, d.compute(20,2));
    }

}

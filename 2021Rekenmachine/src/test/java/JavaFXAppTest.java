import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {


    @Test
    void divisionTest()
    {
        JavaFXApp j = new JavaFXApp();
        int expected = 10;
        int result = j.computeDivide(20,2);
        assertEquals(expected,result);
    }


    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
}
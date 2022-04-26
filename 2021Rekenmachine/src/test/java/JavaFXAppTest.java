import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    private JavaFXApp javaFXApp;
    @BeforeEach
    void setUp() {
        javaFXApp = new JavaFXApp();
    }

    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeAddTest() {
        Assertions.assertEquals(6, javaFXApp.computeAdd(1, 5));
        Assertions.assertEquals(16, javaFXApp.computeAdd(10, 6));
        Assertions.assertEquals(4, javaFXApp.computeAdd(-1, 5));
    }
  
    @Test
    void divisionTest()
    {
        int expected = 10;
        int result = javaFXApp.computeDivide(20,2);
        assertEquals(expected,result);
    }
}
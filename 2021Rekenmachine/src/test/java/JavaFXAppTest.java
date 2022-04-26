import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    JavaFXApp JavaFXApp;
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @BeforeEach
    void setUp() {
        JavaFXApp = new JavaFXApp();
    }

    @Test
    void computeAddTest() {
        Assertions.assertEquals(6, JavaFXApp.computeAdd(1, 5));
        Assertions.assertEquals(16, JavaFXApp.computeAdd(10, 6));
        Assertions.assertEquals(4, JavaFXApp.computeAdd(-1, 5));
    }
}
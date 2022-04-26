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
    void computeMultiplyTest() {
        //Arrange
        int expected = 15;

        //Act
        int actual = javaFXApp.computeMultiply(5,3);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
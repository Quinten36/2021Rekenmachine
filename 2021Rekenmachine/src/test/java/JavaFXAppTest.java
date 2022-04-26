import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    private JavaFXApp javaFXApp;
    IComputation computation;
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

    @Test
    void computeAddTest() {
        computation = new AddCompution();
        Assertions.assertEquals(6, computation.compute(1, 5));
        Assertions.assertEquals(16, computation.compute(10, 6));
        Assertions.assertEquals(4, computation.compute(-1, 5));
    }
  
    @Test
    void divisionTest()
    {
        int expected = 10;
        int result = javaFXApp.computeDivide(20,2);
        assertEquals(expected,result);
    }
}
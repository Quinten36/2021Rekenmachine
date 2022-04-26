import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyComputationsTest {
    MultiplyComputations multiplyComputations;
    @BeforeEach
    void setUp() {
        multiplyComputations = new MultiplyComputations();
    }

    @Test
    void compute() {
        //Arrange
        int expected = 15;

        //Act
        int actual = multiplyComputations.compute(5,3);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
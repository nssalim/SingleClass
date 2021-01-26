import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(100, calculator.add(90, 10));
    }

    @Test
    public void canSubtract(){
        assertEquals(100, calculator.subtract(150, 50));
    }

    @Test
    public void canMultiply(){
        assertEquals(100, calculator.multiply(10, 10));
    }

    @Test
    public void canDivide(){
        assertEquals(1.11, calculator.divide(100, 90), 0.01);
    }
}



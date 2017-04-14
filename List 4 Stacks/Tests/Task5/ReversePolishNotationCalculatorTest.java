package Task5;

import Task5.ReversePolishNotationCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 14.04.2017.
 */
public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new ReversePolishNotationCalculator();

    }

    @Test
    public void calculateExpression1() throws Exception {
        double result = calculator.calculateExpression("12 2 3 4 * 10 5 / + * + ");
        assertEquals(40, result, 0.001);
    }

    @Test
    public void calculateExpression2() throws Exception {
        double result = calculator.calculateExpression("2 3 + 5 * ");
        assertEquals(25.0, result, 0.001);
    }

}
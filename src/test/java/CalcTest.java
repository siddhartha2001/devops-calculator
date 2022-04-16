import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest{
    private static final double DELTA = 1e-15;
    Calc calc = new Calc();

    @Test
    public void test1()
    {
        assertEquals ("Square root True Positive", 3, calc.sqrt(9), DELTA);
    }

    @Test
    public void test2()
    {
        assertNotEquals ("Square root False Positive", 0, calc.sqrt(9), DELTA);
        assertNotEquals ("Square root False Positive", 5, calc.sqrt(10), DELTA);
    }

    @Test
    public void test3()
    {
        assertEquals ("Factorial True Positive", 6, calc.fct(3), DELTA);
        assertEquals ("Factorial True Positive", 720, calc.fct(6), DELTA);
    }

    @Test
    public void test4()
    {
        assertNotEquals ("Factorial Int - False Positive", 1, calc.fct(3), DELTA);
        assertNotEquals ("Factorial Int - False Positive", 100, calc.fct(5), DELTA);
    }

    @Test
    public void test5()
    {
        assertEquals (" Power True Positive", 16, calc.pwr(2, 4), DELTA);
        assertEquals ("Power True Positive", 81, calc.pwr(3, 4), DELTA);
    }

    @Test
    public void test6()
    {
        assertNotEquals ("Power False Positive", 0, calc.pwr(4, 0), DELTA);
        assertNotEquals ("Power False Positive", 18, calc.pwr(3, 3), DELTA);
    }

    @Test
    public void test7()
    {
        assertEquals ("Logarithm True Positive", 0, calc.log(1), DELTA);
        assertEquals ("Logarithm True Positive", 1, calc.log(2.7182), DELTA);
    }

    @Test
    public void test8()
    {
        assertNotEquals ("Logarithm False Positive", 3, calc.log(12), DELTA);
        assertNotEquals ("Logarithm False Positive", 1, calc.log(10), DELTA);
    }
}
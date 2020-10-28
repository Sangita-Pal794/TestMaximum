package TestMaximum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MaximumFloatTest {

	private Maximum testMax;
    private float num1, num2, num3, output;

    public MaxFloatTest(float num1, float num2, float num3, float output) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.output = output;
    }

    @Before
    public void setUp() {
        testMax = new Maximum();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {

                // Given Max Number at 1st Position return the Same Number
                {9.9f, 7.7f, 3.3f, 9.9f},
                {99.99f, 77.77f, 33.33f, 99.99f},
                {999.99f, 777.77f, 333.33f, 999.99f},

                // Given Max Number at 2nd Position return the Same Number
                {7.77f, 9.99f, 3.33f, 9.99f},
                {77.77f, 99.99f, 33.33f, 99.99f},
                {777.77f, 999.99f, 333.33f, 999.99f},

                // Given Max Number at 3rd Position return the Same Number
                {7.77f, 3.33f, 9.99f, 9.99f},
                {77.77f, 33.33f, 99.99f, 99.99f},
                {777.77f, 333.33f, 999.99f, 999.99f},
        });
    }

    @Test
    public void testMaxFloat() {
        assertEquals(output, testMax.maxFloat(num1, num2, num3), 0);
    }
}

package TestMaximum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class Maximum {
	
	private Maximum testMax;
    private Integer num1, num2, num3, output;

    //public MaximumTest(Integer num1, Integer num2, Integer num3, Integer output) {
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
                {9, 7, 3, 9},
                {99, 77, 33, 99},
                {999, 777, 333, 999},
                {9999, 7777, 3333, 9999},

                // Given Max Number at 2nd Position return the Same Number
                {7, 9, 3, 9},
                {77, 99, 33, 99},
                {777, 999, 333, 999},
                {7777, 9999, 3333, 9999},

                // Given Max Number at 3rd Position return the Same Number
                {7, 3, 9, 9},
                {77, 33, 99, 99},
                {777, 333, 999, 999},
                {7777, 3333, 9999, 9999},
        });
    }

    @Test
    public void testMaxInteger() {
        assertEquals(output, testMax.maxInteger(num1, num2, num3));
    }

}

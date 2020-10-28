package src.test.java.TestMaximum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MaxFloatTest {

    private Maximum testMax;
    private List<Float> inputList;
    private Float output;

    public MaxFloatTest(List<Float> inputList, Float output) {
        this.inputList = inputList;
        this.output = output;
    }

    @Before
    public void setUp() {
        testMax = new Maximum(inputList);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {

                // Given Max Number at 1st Position return the Same Number
                {Arrays.asList(9.9f, 7.7f, 3.3f), 9.9f},
                {Arrays.asList(99.99f, 77.77f, 33.33f), 99.99f},
                {Arrays.asList(999.99f, 777.77f, 333.33f), 999.99f},

                // Given Max Number at 2nd Position return the Same Number
                {Arrays.asList(7.77f, 9.99f, 3.33f), 9.99f},
                {Arrays.asList(77.77f, 99.99f, 33.33f), 99.99f},
                {Arrays.asList(777.77f, 999.99f, 333.33f), 999.99f},

                // Given Max Number at 3rd Position return the Same Number
                {Arrays.asList(7.77f, 3.33f, 9.99f), 9.99f},
                {Arrays.asList(77.77f, 33.33f, 99.99f), 99.99f},
                {Arrays.asList(777.77f, 333.33f, 999.99f), 999.99f},

                // N Number of Inputs
                {Arrays.asList(121.99f, 221.99f, 721.99f, 521.99f, 427.55f), 721.99f},
        });
    }

    @Test
    public void testMaxFloat() {
        assertEquals(output, (Float) testMax.testMaximum(), 0);
    }
}


package TestMaximum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import src.test.java.TestMaximum.List;
import src.test.java.TestMaximum.String;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MaximumTest {
	
	private List<String> inputList;
    private String output;

    public MaximumTest(List<Integer> inputList, Integer output) {
        
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
                {Arrays.asList(9, 7, 3), 9},
                {Arrays.asList(99, 77, 33), 99},
                {Arrays.asList(999, 777, 333), 999},
                {Arrays.asList(9999, 7777, 3333), 9999},

                // Given Max Number at 2nd Position return the Same Number
                {Arrays.asList(7, 9, 3), 9},
                {Arrays.asList(77, 99, 33), 99},
                {Arrays.asList(77, 999, 333), 999},
                {Arrays.asList(7777, 9999, 3333), 9999},

                // Given Max Number at 3rd Position return the Same Number
                {Arrays.asList(7, 3, 9), 9},
                {Arrays.asList(77, 33, 99), 99},
                {Arrays.asList(777, 333, 999), 999},
                {Arrays.asList(7777, 3333, 9999), 9999},
                
             // N Number of Inputs
                {Arrays.asList(121, 221, 721, 521, 424), 721},
        });
    }

    @Test
    public void testMaxInteger() {
        assertEquals(output, testMax.maxInteger(num1, num2, num3));
    }

}

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

public class MaximumStringTest {

	private List<String> inputList;
    private String output;

    public MaxStringTest(List<String> inputList, String output) {
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

                // Given Max String at 1st Position return the Same String
                {Arrays.asList("Peach", "Apple", "Banana"), "Peach"},
                {Arrays.asList("Terminal", "Electrode", "Blade"), "Terminal"},
                {Arrays.asList("Starfish", "Leather", "Bean", "Starfish"},

                // Given Max String at 2nd Position return the Same String
                {Arrays.asList("Apple", "Peach", "Banana"), "Peach"},
                {Arrays.asList("Blade", "Terminal", "Electrode"), "Terminal"},
                {Arrays.asList("Bean", "Starfish", "Leather"), "Starfish"},

                // Given Max String at 3rd Position return the Same String
                {Arrays.asList("Banana", "Apple", "Peach"), "Peach"},
                {Arrays.asList("Blade", "Electrode", "Terminal"), "Terminal"},
                {Arrays.asList("Bean", "Leather", "Starfish"), "Starfish"},
                
             // N Number of Inputs
                {Arrays.asList("Apple", "Orange", "Banana", "Papaya", "Pomegranate"), "Pomegranate"},
        });
    }

    @Test
    public void testMaxFloat() {
        assertEquals(output, testMax.testMaximum());
    }
}

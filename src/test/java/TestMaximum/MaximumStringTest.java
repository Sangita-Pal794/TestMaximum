package src.test.java.TestMaximum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MaximumStringTest {

	private Maximum testMax;
    private String str1, str2, str3, output;

    public MaxStringTest(String str1, String str2, String str3, String output) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
        this.output = output;
    }

    @Before
    public void setUp() {
        testMax = new Maximum(str1, str2, str3);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {

                // Given Max String at 1st Position return the Same String
                {"Peach", "Apple", "Banana", "Peach"},
                {"Terminal", "Electrode", "Blade", "Terminal"},
                {"Starfish", "Leather", "Bean", "Starfish"},

                // Given Max String at 2nd Position return the Same String
                {"Apple", "Peach", "Banana", "Peach"},
                {"Blade", "Terminal", "Electrode", "Terminal"},
                {"Bean", "Starfish", "Leather", "Starfish"},

                // Given Max String at 3rd Position return the Same String
                {"Banana", "Apple", "Peach", "Peach"},
                {"Blade", "Electrode", "Terminal", "Terminal"},
                {"Bean", "Leather", "Starfish", "Starfish"},
        });
    }

    @Test
    public void testMaxFloat() {
        assertEquals(output, testMax.testMaximum());
    }
}

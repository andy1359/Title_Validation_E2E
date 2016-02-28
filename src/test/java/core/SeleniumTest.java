package core;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.ComparisonFailure;

@RunWith(Parameterized.class)

public class SeleniumTest {
    @BeforeClass
    public static void BeforeClass01() throws Exception  {
    }
    // Test data generator
    @Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
    public static Collection<String[]> data() throws IOException {
           core.Selenium selenuim = new core.Selenium();
           return Arrays.asList(selenuim.a2d());
    }
    // @Parameter for Field injection instead of Constructor
    @Parameter(value = 0)
    public String id;
    @Parameter(value = 1)
    public String expected;
    @Parameter(value = 2)
    public String actual;
    @Test
    public void test_Title_Validation()  throws ComparisonFailure {
    System.out.println("Test Case: " + id + " Expected Result: " + expected + "Actual Result: " + actual);
           assertEquals("FAILED", expected, actual);
    }
}
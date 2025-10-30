package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int input;
    private final int expected;

    public FelineParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {5, 5}
        };
    }

    @Test
    public void getKittensShouldReturnExpectedValue() {
        Feline feline = new Feline();
        assertTrue("Ожидалось значение " + expected, feline.getKittens(input) == expected);
    }
}




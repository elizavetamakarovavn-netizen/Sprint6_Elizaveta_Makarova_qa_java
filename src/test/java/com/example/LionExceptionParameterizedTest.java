package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class LionExceptionParameterizedTest {

    @Parameterized.Parameters
    public static Object[][] invalidSexValues() {
        return new Object[][]{
                {"10000101"},
                {"Самей"},
                {"lion"},
                {" "},
                {null}
        };
    }

    private final String sex;

    public LionExceptionParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Test
    public void shouldThrowExceptionWhenInvalidSexProvided() {
        boolean exceptionThrown = false;

        try {
            new Lion(sex, new Feline());
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Ожидалось исключение для некорректного значения пола: " + sex, exceptionThrown);
    }
}



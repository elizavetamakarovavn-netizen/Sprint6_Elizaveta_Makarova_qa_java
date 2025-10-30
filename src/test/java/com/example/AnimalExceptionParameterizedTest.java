package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class AnimalExceptionParameterizedTest {

    @Parameterized.Parameters
    public static Object[][] invalidAnimalKinds() {
        return new Object[][]{
                {"Пришелец!"},
                {"Земноводное"},
                {"mushroom"},
                {"11010001"},
                {" "},
                {null},
        };
    }

    private final String animalKind;

    public AnimalExceptionParameterizedTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Test
    public void shouldThrowExceptionWhenInvalidAnimalKindProvided() {
        Animal animal = new Animal();
        boolean exceptionThrown = false;

        try {
            animal.getFood(animalKind);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Ожидалось исключение, но его не было", exceptionThrown);
    }
    }



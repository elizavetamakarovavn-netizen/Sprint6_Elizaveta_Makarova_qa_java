package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Predator predatorMock;

    @Test
    public void getKittensReturnsValueFromPredator() {
        try {
            when(predatorMock.getKittens()).thenReturn(3);

            Lion lion = new Lion("Самец", predatorMock);
            int kittens = lion.getKittens();

            assertTrue(kittens == 3);
            verify(predatorMock, times(1)).getKittens();
        } catch (Exception e) {
            assertTrue("Не должно быть исключения", false);
        }
    }

    @Test
    public void getFoodReturnsPredatorFood() {
        try {
            List<String> expectedFood = List.of("Животные", "Птицы");
            when(predatorMock.eatMeat()).thenReturn(expectedFood);
            Lion lion = new Lion("Самец", predatorMock);
            List<String> food = lion.getFood();
            assertTrue(expectedFood.equals(food));
            verify(predatorMock, times(1)).eatMeat();
        } catch (Exception e) {
            assertTrue("Не должно быть исключения", false);
        }
    }
}






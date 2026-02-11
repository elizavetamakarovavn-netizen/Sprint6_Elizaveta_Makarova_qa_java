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
    private Feline felineMock;

    @Test
    public void getKittensReturnsValueFromFeline() throws Exception {
        when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineMock);
        int kittens = lion.getKittens();
        assertTrue(kittens == 3);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы");
        when(felineMock.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", felineMock);
        List<String> food = lion.getFood();
        assertTrue(expectedFood.equals(food));
    }
}







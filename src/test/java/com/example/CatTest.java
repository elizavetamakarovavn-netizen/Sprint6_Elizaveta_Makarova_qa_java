package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void testGetSoundReturnsMeow() {
        Cat cat = new Cat(feline);
        assertTrue("Ожидался звук 'Мяу'", "Мяу".equals(cat.getSound()));
    }

    @Test
    public void testGetFoodUsesPredator() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertTrue("Список еды должен совпадать", food.equals(List.of("Птицы", "Рыба")));
    }
}




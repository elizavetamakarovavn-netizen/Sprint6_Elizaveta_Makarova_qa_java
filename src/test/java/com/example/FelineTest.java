package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        assertTrue("Список еды хищника некорректный", food.equals(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertTrue("Ожидалось семейство 'Кошачьи'", "Кошачьи".equals(feline.getFamily()));
    }

    @Test
    public void getKittensWithoutArgsReturnsOne() {
        assertTrue("При вызове без параметров ожидается 1 котёнок", feline.getKittens() == 1);
    }

    @Test
    public void getKittensWithArgsReturnsCorrectValue() {
        int expected = 5;
        assertTrue("Ожидалось значение " + expected, feline.getKittens(expected) == expected);
    }
}



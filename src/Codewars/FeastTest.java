package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FeastTest {
    @Test
    public void fixedTest() {

        Feast feast = new Feast();
        String beast = "great blue heron";
        String dish = "garlic nann";
        Boolean expectedResult = feast.feast(beast, dish);
        Boolean actualResult = feast.feast(beast, dish);
        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }

//            assertTrue(Feast.feast("great blue heron","garlic nann"));
//            assertTrue(Kata.feast("chickadee","chocolate cake"));
//            assertFalse(Kata.feast("brown bear","bear claw"));
//

    @Test
    public void fixedTestFalse() {
        Feast feast = new Feast();
        String beast = "great blue heron";
        String dish = "garlic bread";
        Boolean expectedResult = feast.feast(beast, dish);
        Boolean actualResult = feast.feast(beast, dish);
        Assertions.assertFalse(expectedResult, String.valueOf(actualResult));
    }


}

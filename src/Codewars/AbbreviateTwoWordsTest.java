package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbbreviateTwoWordsTest {

    @Test
    public void fixedTest(){
        AbbreviateTwoWords twoWords = new AbbreviateTwoWords();
        String name = "Nick Mal";

        String expectedResult = twoWords.abbrevName(name);
        String actualResult = AbbreviateTwoWords.abbrevName(name);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
    }
}

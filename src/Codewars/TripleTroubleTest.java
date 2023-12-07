package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TripleTroubleTest {

    @Test
    public void fixedTest() {

        TripleTrouble tripleTrouble = new TripleTrouble();
        String str1 = "great";
        String str2 = "garlic";
        String str3 = "garlic";

        String expectedResult = tripleTrouble.tripleTrouble(str1, str2, str3);
        String actualResult = TripleTrouble.tripleTrouble(str1, str2, str3);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
    }

}
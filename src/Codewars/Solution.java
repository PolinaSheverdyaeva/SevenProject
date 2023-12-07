package Codewars;
import java.lang.StringBuilder;
public class Solution {

    static String toCamelCase(String snakeCase) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitilizeNext = false;

        for(char c : snakeCase.toCharArray()) {
            if (c == '_'){
                capitilizeNext = true;
            } else {
                if (capitilizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitilizeNext = false;
                }else{
                    camelCase.append(c);
                }
            }
        }
        return camelCase.toString();
    }



    public static void main(String[] args) {

        String str = "the_stealth_warrior";
        String strNew = toCamelCase(str);
        System.out.println(str);
        System.out.println(strNew);

    }


}

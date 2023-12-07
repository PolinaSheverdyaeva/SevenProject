package Codewars;
import java.lang.StringBuilder;
public class ToCamelCaseAnother {

    static String toCamelCase(String dashCase) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitilizeNext = false;

        for(char c : dashCase.toCharArray()) {
            if (c == '-'){
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

        String str = "the-stealth-warrior";
        String strNew = toCamelCase(str);
        System.out.println(str);
        System.out.println(strNew);

    }

}

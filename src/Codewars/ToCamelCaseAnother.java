package Codewars;
import java.lang.StringBuilder;
public class ToCamelCaseAnother {

    public static String toCamelCase(String dashCase) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for(char c : dashCase.toCharArray()) {
            if (c == '-'){
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                }else{
                    camelCase.append(c);
                }
            }
        }
        return camelCase.toString();
    }

    public static String toCamelCase2(String s){
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for(char c : s.toCharArray()){
            if( c == '-' || c == '_') {
                capitalizeNext = true;
            } else {
                if(capitalizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
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

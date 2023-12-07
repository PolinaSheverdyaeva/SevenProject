package Codewars;

public class ToCamelCaseAll {


//    import java.lang.StringBuilder;
//    class Solution{
//
//        static String toCamelCase(String s){
//            String[] words = s.split("[_\\-]");
//            s=words[0];
//            for(int i=1; i<words.length; i++)
//                s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
//            return s;
//        }
//    }
    static String toCamelCase(String s){
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
        String str1 = "the-stealth-warrior";
        String str2 = "The_Stealth_Warrior";
        System.out.println(toCamelCase(str1));
        System.out.println(toCamelCase(str2));
    }
}

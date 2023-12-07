package Codewars;

public class XO {

    public static void main(String[] args) {
        System.out.println(getXO("xoxo"));
    }
    public static boolean getXO (String str){
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'x'){
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }
        return countO == countX;
    }
}

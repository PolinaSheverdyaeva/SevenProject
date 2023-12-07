package Codewars;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] str = name.split(" ");
        return (str[0].charAt(0) + "." + str[1].charAt(0)+ ".");
    }

    public static void main(String[] args) {
        String name = "Sam Harris";

        System.out.println(abbrevName(name));
    }
}

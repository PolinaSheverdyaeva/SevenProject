package ProgrammInJavaBook;

public class Diamond {
    public static void main(String[] args) {

        for (int row = 0; row < 5; row++) {

            int limit = 5 - row;
            for (int spaces = 0; spaces < limit; spaces++) {
                System.out.print(" ");
            }


            for (int digits = 0; digits <= row; digits+=2) {
                System.out.print("*");
            }
            for (int digits = 1; digits < limit; digits++) {
                System.out.print(digits);
            }
            System.out.println();
        }
    }}

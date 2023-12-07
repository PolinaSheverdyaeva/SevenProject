package ProgrammInJavaBook;

public class Asterisk {
    public static void main(String[] args) {

        {
            System.out.println("5.15a");

            for (int row = 10; row >= 0; row--) {

                int limit = 10 - row;

                for (int asterisks = 0; asterisks < limit; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }


        { // 5.15
            System.out.println("5.15b");

            for (int row = 0; row < 10; row++) {

                int limit = 10 - row;
                for (int asterisks = 0; asterisks < limit; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        {
            System.out.println("5.15c");

            for (int row = 0; row < 10; row++) {

                int limit = row;
                for (int spaces = 0; spaces < limit; spaces++) {
                    System.out.print(" ");
                }

                int limit2 = 10 - row;
                for (int asterisks = 0; asterisks < limit2; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            {
                System.out.println("5.15d");

                for (int row = 0; row < 10; row++) {

                    int limit = 10 - row;
                    for (int spaces = 0; spaces < limit; spaces++) {
                        System.out.print(" ");
                    }

                    int limit2 = row + 1;
                    for (int asterisks = 0; asterisks < limit2; asterisks++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }

        }


    }
}

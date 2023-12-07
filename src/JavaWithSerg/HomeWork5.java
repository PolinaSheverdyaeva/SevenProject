package JavaWithSerg;

public class HomeWork5 {


    public static void main(String[] args) {

        System.out.println("Task #1");

//        for (int i = 9; i >= 0; i--) { //номер ряда
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int row;
        int limit;
        int limit2;
        for(row = 0; row < 10; ++row) {
            limit = 10 - row;

            for(limit2 = 0; limit2 < limit; ++limit2) {
                System.out.print(limit2);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Task #2");
//        int row1; // текущий ряд
//        int numberOfDigitsInaRow; // number of digits in a row
//        int currentDigit; // текущие цифры, которые мы печатаем
//        for (row1 = 0; row1 < 10; ++row1) {

//
//            for (currentDigit = 0; currentDigit < numberOfDigitsInaRow; ++currentDigit) {
//                System.out.print(currentDigit);
//            }

//
//
//            int digits;
//            for (row1 = 0; row1 < 10; ++row1) {
//                numberOfDigitsInaRow = row1;
//
//                for (currentDigit = 0; currentDigit < numberOfDigitsInaRow; ++currentDigit) {
//                    System.out.print(" ");
//                }
//
//                currentDigit = 10 - row1;
//
//                for (digits = 0; digits < currentDigit; ++digits) {
//                    System.out.print(digits);
//                }
//
//                System.out.println();
//            }

        int digits;
        for(row = 0; row < 10; ++row) {
            limit = row;

            for(limit2 = 0; limit2 < limit; ++limit2) {
                System.out.print(" ");
            }

            limit2 = 10 - row;

            for(digits = 0; digits < limit2; ++digits) {
                System.out.print(digits);
            }

            System.out.println();
        }

            System.out.println();
            System.out.println("Task #3");

            int row1;
            int numberOfDigitsInaRow;
            int currentDigit;
            for (row1 = 0; row1 < 10; ++row1) {
                numberOfDigitsInaRow = row1;

                for (currentDigit = 0; currentDigit < numberOfDigitsInaRow; ++currentDigit) {
                    System.out.print(" ");
                }

                currentDigit = 10 - row1;

                for (digits = currentDigit - 1; digits >= 0; --digits) {
                    System.out.print(digits);
                }

                for (digits = 1; digits < currentDigit; ++digits) {
                    System.out.print(digits);
                }

                System.out.println();
            }

        }


    }


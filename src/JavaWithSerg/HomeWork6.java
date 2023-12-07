package JavaWithSerg;

public class HomeWork6 {

    // create a method to print the task numbers
    static int counter = 1;

    public static void printTask() {

        System.out.println("Task # " + counter++);
    }

//    static int number = 1;
//
//    public static void printSubtask() {
//        System.out.println("Задача " + number++);
//    }

//    public static void taskAndPrint() {
//        printTask();
//        printSubtask();
//    }

    public static void main(String[] args) {
        printTask();

/*
         Задача №1

        Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести сумму всех значений массива.
 */

        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println("Sum found by for i " + sum);

            for (int current : array) {
                sum += current;
            }
            System.out.println("Sum found by for each " + sum);
        }

        printTask();
        /*
        Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.
         */
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }

            }
            System.out.println(max);

        }
        printTask();
        {
        /*
        Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести минимальное значение массива.
         */
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println(min);
        }
        printTask();
        {
            /* Задача №4

            Дан массив:
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            необходимо вывести среднее арифметическое всех значений массива.
             */
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            int count = 0;
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                count++;
            }
            System.out.println("Elements in the array " + count);

            for (int current : array) {
                sum += current;
            }
            System.out.println("Sum of the elements in the array " + sum);

            int avg = sum / count;
            System.out.println("Average of the array " + avg);


        }

        printTask();
        {
        /*
        Задача №5
           Дан массив:
           int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            необходимо вывести сумму элементов массива.
         */
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
            System.out.println("Sum of elements in the multi-dimensional massive " + sum);
        }

        printTask();
        {
            /*
            Задача №6
            Дан массив:
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            необходимо вывести максимальное значение массива.
             */
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (max < array[i][j]) {
                        max = array[i][j];
                    }
                }

            }
            System.out.println("Max value in the multi-dimensional massive " + max);
        }

        printTask();
        {
            /*
            Задача №7
          Дан массив:
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            необходимо вывести количество элементов в массиве.
             */
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    count++;
                }
            }
            System.out.println("Number of elements in multi-dimencial array " + count);

        }





    }
}

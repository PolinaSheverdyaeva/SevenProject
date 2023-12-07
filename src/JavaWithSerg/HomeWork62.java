package JavaWithSerg;

import java.util.Arrays;

public class HomeWork62 {
    public static void main(String[] args) {

        System.out.println("Task 1");
        /*
        Задача №1

Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)

         */
        {
            String str = "Перестановочный алгоритм быстрого действия";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'о') {
                    System.out.print(str.charAt(i));
                }
            }

            System.out.println();
            System.out.println("Task 2");
        }
/*
Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.

 */
        {
            String s = "Перевыборы выбранного президента";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'е') {
                    count++;
                }
            }
            System.out.println(count);
        }

        System.out.println("Task 3");

        /*
        Задача №3

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.

         */

        {
            String s = "Посмотрите как Рите нравится ритм";
            s = s.toLowerCase();
            System.out.println(s);
            String rit = "рит";
            int index = s.indexOf(rit);


            while(index != -1){
                System.out.println(index);
                index = s.indexOf(rit, index +1);
            }
        }

        System.out.println("Task 4");

        /*
        Экстра задача

Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

         */
        {
            String[][] array = {
                    {"Привет", "всем", "кто"},
                    {"изучает", "язык", "программирования"},
                    {"java"}
            };


//            StringBuilder sb = new StringBuilder();
//            for (String[] row : array) {
//                sb.append(Arrays.toString(row));
//            }
//            String result = sb.toString();
//            System.out.println(result);
//
//
//            Character ch = 'е';
//            int index = result.indexOf(ch);
//
//            while(index != -1){
//                System.out.println("indexes with e " + index);
//                index = result.indexOf(ch, index +1);
//            }


//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                boolean skipRow = false;
//                for (int j = 0; j < array[i].length; j++) {
//                    System.out.println(array[j][i]);
//                    if (array[j][i].indexOf('е') >= 0) {
//                        skipRow = true;
//                        break;
//                    }
//                }
//
//                if(!skipRow) {
//                    count++;
//                }
//
//            }
//            System.out.println("Number of rows in multi-dimencial array without 'e' " + count);

            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
//                    System.out.println(array[i][j]);
                    if (array[i][j] != null && array[i][j].indexOf('е') < 0) {
                        count++;
                    }
                }
            }

            System.out.println("Number of strings in multi-dimencial array without 'e': " + count);





        }
    }
}

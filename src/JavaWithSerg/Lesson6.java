package JavaWithSerg;

import java.util.Arrays;
import java.util.Set;

public class Lesson6 {
    public static void main(String[] args) {
        // find min value in array
        int[] arr = {10, 5, 3, 8, 2, 4, 6};
        // find the max/min value in an array
        int result = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(result > arr[i]){
//                result = arr[i];
//            }
// find max value in array
        for (int cur : arr) {
            if (cur > result) {
                result = cur;
            }
        }
        System.out.println(result);

//        int[] arr = {1, 2, 3, 4};
//
//        int[] arr1 = new int[10];

        //Sum up all the elements in an array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(" Sum " + sum);

        //Find how many elements in an array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;

        }
        System.out.println(count);

        int count1 = 0;
        for (int cur : arr) {
            count1++;
        }
        System.out.println(count1);
        {

            // find how many elements in a multi-dimensional array
            int[][] arr1 = {{1, 5}, {3, 8, 2}, {}, {6}};

            int sum2 = 0;
            for (int i1 = 0; i1 < arr1.length; i1++) {
                //тут пишем длинну вложенного массива
                for (int j = 0; j < arr1[i1].length; j++) {
                    sum2 += arr1[i1][j];
                }
            }
            System.out.println(sum2);
        }

        {
            // find max/min in a multi-dimensional array
            int[][] arr1 = {{10, 5}, {3, 8, 2}, {}, {6}};
            int min = arr1[0][0];

            for (int i1 = 0; i1 < arr1.length; i1++) {
                //тут пишем длинну вложенного массива
                for (int j = 0; j < arr1[i1].length; j++) {
                    if (min > arr1[i1][j]) {
                        min = arr1[i1][j];
                    }
                }
            }
            System.out.println(min);

        }

        {
            int[] arr5 = {10, 5, 3, 8, 2, 6};
// find min value in array
            int f = arr5[0]; // когда мы берем первый элемент массиваб это классическое решение. Если пустой массив?
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr5.length; i++) {
                if (min > arr5[i]) {
                    min = arr5[i];
                }
            }
            System.out.println("min " + min);


        }

        {
//        find max value in an array
            int[] arr5 = {10, 5, 3, 8, 2, 6};
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr5.length; i++) {
                if (max < arr5[i]) {
                    max = arr5[i];
                }
            }
            System.out.println( " max " + max);
        }
        {
            Integer a = 10;
            System.out.println(a.doubleValue());
        }
        {
            // пробежать по всем символам в строке
            String str = "Sergey is programmer";
            for (int i = 0; i < str.length(); i++) {
                System.out.print( str.charAt(i) );
            }

        }
        {
            System.out.println();
            int[] array = {1, 2, 3};
            //int[] array2 = array;
            int[] array2 = {1, 2, 3};
            System.out.println( array == array2 ); // false
            System.out.println(Arrays.equals(array, array2)); // true
        }

        {
            Integer a = 10;
            Integer b = 10;
            System.out.println( a == b ); // true, but 1000 will be false.
            System.out.println(a.equals(b));
            
            String s1 = "Hi!";
            String s2 =  new String("Hi") + new String("!");
            System.out.println( s1 == s2 );
        }
    }

}

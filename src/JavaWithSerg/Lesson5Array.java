package JavaWithSerg;

import java.util.Arrays;

public class Lesson5Array {

    public static void main (String[] args){

//        int a = 10;
//        int b = a;
//
//        b = 5;
////        int[] array = {10, 100, 1000, 10000, 100000};
////        System.out.println(array[1]);
//
//        int[] arr1 = {10, 100, 1000, 10000, 100000};
//        int[] arr2 = arr1;
//
//        arr2[0] = 20;
//
//        int[] arr3 = {5, 50};
//
//        System.out.println( arr1[0]);
//
//        // print massive, arr1 and arr2 ссылаются на один объект
//        System.out.println(arr1);
//        System.out.println(arr2);
//        System.out.println(arr3);
//        System.out.println(Arrays.toString(arr1));
//
//        // как пробежаться по массиву
//
//        int [] arr = new int[]{1, 2, 3, 4};
//
//        //for (int i = 0; i< arr1.length ; i++){
//        for (int i = 0, p =1; i < arr.length; i++, p *= 5 ){
//
//            arr [i] = p;
//           }
//        System.out.println(Arrays.toString(arr));

        //Массивы одномерные и многомерные

        int [][] arr5 = {{1, 10, 100},
                         {2, 20, 200},
                         {3, 30, 300}};

        System.out.println(arr5.length);

        System.out.println(Arrays.deepToString(arr5));

        for (int i = 0; i<arr5.length; i++ ) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.println(arr5[i][j]);
            }
        }
    }
}

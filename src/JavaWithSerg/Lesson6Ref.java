package JavaWithSerg;

import java.util.Arrays;

public class Lesson6Ref {
    public static void main(String[] args) {
        {
            int[] arr = new int[]{1, 2, 3, 4};

            int[] arr2 = arr;
            arr2[0] = 100;
            System.out.println(Arrays.toString(arr));

            String str = "Hello";
            String str2 = str;
            str2 = "hi";
            System.out.println(str);
        }
        {
            Integer a = 10;
            int b = 50;
            a = b;
            a = a + a;
            a.toString();
            System.out.println("a " + a);
        }
        {
            Integer[] a1 = new Integer[5];
            int[] b1 = new int[5];
            System.out.println(Arrays.toString(a1));
            System.out.println(Arrays.toString(b1));

        }
        {
            Long L = 10L;
            long l = 1;

            Double D = 10.0;
            double d = 1;
        }
        {
            String str = null;
            str = "Sergey";
            // Find number of symbol "r"
            System.out.println(str.indexOf("r"));
        }
        {
            String str = "Sergey";
            str = str.toLowerCase();
            System.out.println(str);
        }
        {
            String str = "Sergey";
            str = str.replace('r','s');
            System.out.println(str);
    }
        {

            String str = "Sergey is programmer";
            str = str.replace("programmer", "teacher");
            System.out.println(str);

        }
        {

        }


    }

}

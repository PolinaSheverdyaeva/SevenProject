package JavaWithSerg;

public class Utils {

    String hi;
    int sum(int first, int second){
        int sum = first + second;

        return sum;
    }
    void printSum(int first, int second){ // одни и те же параметры в обоих методах

        System.out.println(hi + "sum " + sum(first,second)); // we call the above sum method here
    }

    public static int sum(int firstValue, int secondValue, int thirdValue){
        return firstValue + secondValue + thirdValue;

    }

    void division(int first, int second){
        double division = 1.0 * first / second;
        System.out.println("division " + division);
    }


}

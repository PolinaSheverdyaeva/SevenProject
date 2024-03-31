package myPackage;

public class Swapper {


//    public Object[] arguments;

//    public Swapper(Object[] arguments) {
//        this.arguments = arguments;
//    }

    public Swapper(){

    }
    public void swapValues(Object[] arguments) {
        //Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }

    public static void main(String[] args) {

        Object[] numbers = new Object[]{10, 20};
        System.out.println("Before swapping: " + numbers[0] + ", " + numbers[1]);

        Swapper swapper = new Swapper();

        swapper.swapValues(numbers);

        System.out.println("After swapping: " + numbers[0] + ", " + numbers[1]);
    }
}

package JavaWithSerg;

public class Lesson7 {


    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.hi = "Hi!";
        int a = 10;
        int b = 11;
        utils.sum(a, b);

//        int sum = a + b;
       //Integer b = 11 + a + Math.abs(a);

//        System.out.println("sum " + sum);

        int c = 12;
        int d = 13;

        utils.sum(c,d);
        utils.sum(1, 3 * 2);
//        utils.sumOf3(c, d, a);
        utils.division(8, 3);

        utils.printSum(c,d);
        utils.printSum(1, 3 * 2 + a - b);


//        int sum2 = a + b;
//
//        System.out.println("sum " + sum2);

        Person7 john = new Person7();
        Name name = new Name();
        name.firstName = "John";
        name.lastName = "Doe";
        john.name = name;
        john.age = 36;

        Person7 jane = new Person7();
        name = new Name();
        name.firstName = "Jane";
        name.lastName = "Doe";
        jane.name = name;
        jane.age = 35;

//        System.out.println("name " + john.name + " age" + john.age);
//        System.out.println("name " + jane.name + " age" + jane.age);

        System.out.println(john.getFullInfo());
        System.out.println(jane.getFullInfo());

    }



}

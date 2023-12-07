package JavaWithSerg;

public class Study {
    public static void main( String[] args ) {

        Person p1 = new Employee("Boris", "Petrov", 25, 100000);
        Person p2 = new Employee("Mike", "Borzov", 35, 110000);
        Person p3 = new Employee("Nick", "Ivanov", 45, 120000);

        p2.setFirstName("Masha");

//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());

        System.out.println(p2.getFirstName() + " " + p2.getLastName());

    } // end main

}

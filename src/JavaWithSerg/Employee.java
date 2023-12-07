package JavaWithSerg;

public class Employee extends Person {

    protected int age;
    protected int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName);
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

package JavaWithSerg;

import java.util.Objects;

public class EmployeeHW7 {

    /*
    Задача №2

Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который
возвращает true, если у сотрудника у которого был вызван метод и сотрудника
который был передан как параметр, одинаковое имя.

     */

    String name;
    int age;
    char gender;
    double salary;

    public EmployeeHW7(String name, char gender, int age, double salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public Boolean isSameName(EmployeeHW7 employee) {

        return this.name.equals(employee.name);
    }

    public static void main(String[] args) {
        EmployeeHW7 e1 = new EmployeeHW7("Polina", 'F', 40, 1000.0);
        EmployeeHW7 e2 = new EmployeeHW7("Denis", 'F', 40, 1000.0);
        System.out.println(e1.isSameName(e2));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            EmployeeHW7 employee = (EmployeeHW7)o;
            return this.age == employee.age && this.gender == employee.gender && Double.compare(employee.salary, this.salary) == 0 && Objects.equals(this.name, employee.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.age, this.gender, this.salary});
    }

}

package JavaWithSerg;

public class Salary7 {

     /*
    Задача №3

Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
аргумента вызова метода.

     */

    static double employeeArray[ ] = { 1000.49, 2456.00, 5892.00, 738273.09};

    static double getSum(){
        double sum = 0;

        for (int i = 0; i < employeeArray.length; i++){
            sum += employeeArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( "Total salary is " + getSum());
    }

}

package Homework8_1;

public class Employee {

    /*
    Задача №1

Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
Все поля сделать приватными и для каждого поля добавить методы set и get.
Класс должен иметь метод - getSalary(int days), метод возвращает зарплату
за количество дней которые были переданы в качестве аргумента.

     */

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    double getSalary(int days){
        double totalSalary = days * salaryPerDay;
        return totalSalary;
    }
}

package Homework8_1;

public class Manager {

    /*
    Задача №2
Необходимо создать класс Manager с полями: имя, возраст, пол,
ЗП в день и количество подчиненных. Все поля сделать приватными и
для каждого поля добавить методы set и get. Класс должен иметь метод -
getSalary(int days), метод возвращает зарплату за количество дней
которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
     */
    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;

    private int numberOfSuburdinates;

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

    public int getNumberOfSuburdinates() {
        return numberOfSuburdinates;
    }

    public void setNumberOfSuburdinates(int numberOfSuburdinates) {
        this.numberOfSuburdinates = numberOfSuburdinates;
    }
    double getSalary(int days){
        double totalSalary = days * salaryPerDay;
        return totalSalary;
    }

    double getManagerSalary(double totalSalary, int numberOfSuburdinates){
        return 0.01 * numberOfSuburdinates * totalSalary + totalSalary;
    }



}

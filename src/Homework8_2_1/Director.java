package Homework8_2_1;

public class Director extends Manager {
    public Director(String name, int age, String gender, double baseSalary, int numberOfSuburdinates){
        super(name, age, gender, baseSalary, numberOfSuburdinates);
    }

    public double getSalaryDirector () {
        return(this.getNumberOfSubordinates() == 0) ? (this.getBaseSalary()) : (this.getBaseSalary() * ((this.getNumberOfSubordinates() / 100.00) * 9));
    }
}

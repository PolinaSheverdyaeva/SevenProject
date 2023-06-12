package Homework8_2_1;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public Manager (String name, int age, String gender, double baseSalary, int numberOfSubordinates){
        super(name, age, gender, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
       return numberOfSubordinates;
    }

    public void setNumberOfSuburdinates(int numberOfSuburdinates){
        this.numberOfSubordinates = numberOfSuburdinates;
    }

    public double getSalaryManager(){
        return (numberOfSubordinates == 0) ? (this.getBaseSalary()) : (this.getBaseSalary()*(numberOfSubordinates/100) * 3);

    }

    @Override
    public double getSalary() {
        return getSalaryManager();
    }
}

package qagroup2;

public class Employee {

    /*
  Необходимо создать класс Employee со следующими методами:
●	getName - получить имя
●	setName
●	getBaseSalary - базовая ставка
●	setBaseSalary

     */

    private String name;
    private int age;
    private double baseSalary;
    private String gender;

    private Long id;

    public Employee(String name, int age, double baseSalary, String gender) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getSalary() { return getBaseSalary(); }
}

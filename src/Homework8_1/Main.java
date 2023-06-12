package Homework8_1;

public class Main {
    public static void main(String[] args) {
        {
            Employee e1 = new Employee();
            e1.setName("Peter");
            e1.setAge(50);
            e1.setGender('m');
            e1.setSalaryPerDay(160.00);

            double totalSalary = e1.getSalary(20);
            System.out.println(totalSalary);
        }
        {
            Manager m1 = new Manager();
            m1.setName("Nick");
            m1.setAge(50);
            m1.setGender('m');
            m1.setNumberOfSuburdinates(7);
            m1.setSalaryPerDay(500);

            double totalSalary = m1.getSalary(30);
            double managerSalary = m1.getManagerSalary(totalSalary, m1.getNumberOfSuburdinates());
            System.out.println("Manager Salary: " + managerSalary);
        }




    }
}

package Homework8_2_1;

import JavaWithSerg.EmployeeHW7;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anna", 32, 15546.54, "female");

        Worker w1 = new Worker("Ben", 26, "male", 56112.23);

        Manager m1 = new Manager("Mick", 50, "male", 46578.36, 1);
        Manager m2 = new Manager("Vill", 40, "female", 78326.98, 25);

        Director d1 = new Director("Grace", 20, "female", 45664.36, 25);

        System.out.println(d1.getSalaryDirector());
        System.out.println(m1.getSalaryManager());
        System.out.println(w1.getSalaryWorker());
        System.out.println(e1.getBaseSalary());

        /*
        Задача №3
Необходимо создать класс со следующими методами:
●	поиск сотрудника в массиве по его имени
●	поиск сотрудника в массиве по вхождению указанной строки в его имени
●	подсчет зарплатного бюджета для всех сотрудников в массиве
●	поиск наименьшей зарплаты в массиве
●	поиск наибольшей зарплаты в массиве
●	поиск наименьшего количества подчиненных в массиве менеджеров
●	поиск наибольшего количества подчиненных в массиве менеджеров
●	поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
●	поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
         */

        Employee[] allEmp = new Employee[] {e1, w1, m1, d1};
        Manager[] allMngrs = new Manager[] {m1, m2};

        employeeSearch("Serg", allEmp);
        System.out.println(employeeSearchSub("Mi", allEmp));
        System.out.println(salaryBudget(allEmp));
        System.out.println(minSalary(allEmp));
        System.out.println(maxSalary(allEmp));
        System.out.println("Min number of suburdinates " + minNumberOfSubordinates(allMngrs));
        System.out.println("Max number of suburdinates " + maxNumberOfSubordinates(allMngrs));

    }
    //●	поиск сотрудника в массиве по его имени
    public static void employeeSearch(String name, Employee[] allEmp){

        for (Employee current : allEmp) {
            if (current.getName().equals(name)) {
                System.out.println("name was found :" + name);
            } else{
                System.out.println("not found");
            }
        }
    }
    //●	поиск сотрудника в массиве по вхождению указанной строки в его имени

    public int employeeSearch2(String name, Employee[] allEmp){
        for (int i = 0; i < allEmp.length; i++) {
            if(allEmp[i].getName() == name){
                return i;
            }
        }
        return -1;
    }

    public static int employeeSearchSub(String substr, Employee[] allEmp ){
        for (int i = 0; i < allEmp.length; i++) {
            if(allEmp[i].getName().contains(substr)){
                return i;
            }
        }
        return -1;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве

    public static double salaryBudget(Employee[] allEmp){
        double sum=0;
        for(int i = 0; i < allEmp.length; i++){
            if(allEmp[i] instanceof Director){
                sum += ((Director) allEmp[i]).getSalaryDirector();
            } else if (allEmp[i] instanceof Manager){
                sum += ((Manager) allEmp[i]).getSalaryManager();
            } else {
                sum += ((Employee) allEmp[i]).getBaseSalary();
            }
        }
        return sum;
    }

    //●	поиск наименьшей зарплаты в массиве
    public static double minSalary(Employee[] employee){
        double min = Double.MAX_VALUE;
        for (Employee e : employee) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
        }
        return min;
    }

    //●	поиск наибольшей зарплаты в массиве
    public static double maxSalary(Employee[] employee){
        double max = Double.MIN_VALUE;
        for (Employee e : employee) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        return max;
    }

    // ●	поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minNumberOfSubordinates(Manager[] manager){
        int min = Integer.MAX_VALUE;
        for(Manager m : manager){
            if (m.getNumberOfSubordinates() < min) {
                min = m.getNumberOfSubordinates();
            }
        }
        return min;
    }

    // ● поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxNumberOfSubordinates(Manager[] manager){
        int max = Integer.MIN_VALUE;
        for(Manager m : manager){
            if (m.getNumberOfSubordinates() > max) {
                max = m.getNumberOfSubordinates();
            }
        }
        return max;
    }



}












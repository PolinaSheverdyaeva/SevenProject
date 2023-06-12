package Homework8_2_1;

public class Worker extends Employee {
    public Worker(String name, int age, String gender, double baseSalary) {
        super(name, age, baseSalary, gender);
    }

    /*
    Задача №2

Необходимо создать класс Worker где метод getSalaryWorker
будет возвращать зарплату, базовую ставку.

Необходимо создать класс Manager в который нужно добавить следующие методы:
●	getNumberOfSubordinates - получить количество подчиненных
●	setNumberOfSubordinates

в классе, метод getSalaryManager будет возвращать значение по формуле -
<базовая ставка> * (<количество подчиненных> / 100 * 3).
Если количество подчиненных 0, то результат как у обычного рабочего.

Необходимо создать класс Director,
метод getSalaryDirector должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
     */

    public double getSalaryWorker(){
        return this.getBaseSalary();
    }

    @Override
    public double getSalary() {
        return getSalaryWorker();
    }
}

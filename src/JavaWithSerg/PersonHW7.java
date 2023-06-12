package JavaWithSerg;

public class PersonHW7 {

    /*
    Задача №1

Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
если пол указан как мужской и префикс “Mrs. ” если женский.

     */

    String name;
    int age;
    char gender;

    public PersonHW7() {
    }

    public String getName() {
        return this.gender == 'M' ? "Mr " + this.name : "Mrs " + this.name;
    }

    public static void main(String[] args) {
        PersonHW7 person = new PersonHW7();
        person.name = "Polina";
        person.age = 40;
        person.gender = 'F';
        System.out.println(person.getName());
    }

}

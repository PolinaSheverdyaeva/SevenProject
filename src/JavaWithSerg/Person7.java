package JavaWithSerg;

public class Person7 {

    Name name;
    int age;
    String getFullInfo(){
//        return "name " + name + " age" + age;
        return "name " + name.getFullName() + " age" + age;

    }

}

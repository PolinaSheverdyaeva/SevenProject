package JavaWithSerg;

public class Person8 {

 //lesson 9
 public double pi = 3.1415;

 private String name;
 String lastName;

 protected int age;


 public Person8(String name, int age) {
  this(name);
  this.age = age;
 }

 public Person8(String name){
  this.name = "Mrs. " + name;
 }

 String getName() {
  return name;
 }

// public void setName(String name) {
//  if(!"Sergey".equals(name)) {
//   this.name = name;
//  }
// }

 public int getAge() {
  if ("Anna".equals(name)) {
//   return this.age;
   return 16;
  }
  return age;
 }
// public void setAge(int age ) {
//  this.age = age;
// }
//}

}

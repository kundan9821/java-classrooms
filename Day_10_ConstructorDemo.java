class Student {
  int id;
  int age;
  String name;

  Student(int id, int age) {
    this.id = id;
    this.age = age;
    System.out.println("parametrisie constructor ");
    System.out.println("id is :" + id + " age is :" + age);
  }

  Student(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
    System.out.println("parametrisie constructor 2 ");
    System.out.println("id is :" + id + " age is :" + age + " name is: " + name);
  }

  Student() {
    System.out.println("Default constructor");
  }
}

public class Day_10_ConstructorDemo {
  public static void main(String[] args) {
    Student st = new Student(5, 8, " kd");
  }
}

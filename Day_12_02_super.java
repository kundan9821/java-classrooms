// To INVOKE METHOD 
class Animal {
  void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  void eat() {
    System.out.println("Eating Bread");
  }

  void bark() {
    System.out.println("Barking");
  }

  void work() {
    super.eat();
    bark();
  }
}

public class Day_12_02_super {
  public static void main(String[] args) {

    Dog d = new Dog();
    d.work();
  }
}

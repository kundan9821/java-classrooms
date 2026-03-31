class Animal {
  String color = "white";
}

class Dog extends Animal {
  String color = " Black";

  void printcolor() {
    System.out.println("wihtout super e sub clas ka color ko print karega:" + color);
    System.out.println("with super e  Parnet class ka color print karega" + color);
  }
}

public class Day_12_04_Super {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printcolor();

  }
}

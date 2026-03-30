class parentClass {
  void display() {
    System.out.println("parent class method");
  }
}

class childClass extends parentClass {
  void show() {
    System.out.println("child class method");
  }
}

public class Day_10_Inheritance {
  public static void main(String[] args) {
    childClass child1 = new childClass();
    child1.show();
    child1.display();
  }
}

class A {
  void methodA() {
    System.out.println("method of A");
  }
}

class B extends A {
  void methodB() {
    System.out.println("method of B");
  }
}

class C extends B {
  void methodC() {
    System.out.println("method of C");
  }
}

public class Day_11_multiLevel_Inherentance {
  public static void main(String[] args) {
    C obj = new C();
    obj.methodA();
    obj.methodB();
    obj.methodC();
  }
}

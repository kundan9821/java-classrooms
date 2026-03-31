interface A {
  public void run();
}

interface B {
  public void run();
}

class C implements A, B {
  public void run() {
    System.out.println("c class run method");
  }
}

public class Day_12_03_Interface {
  public static void main(String[] args) {
    C obj = new C();
    obj.run();
  }
}

class OverLoadingDemo {
  void sum(int a, int b) {
    System.out.println(a + b);
  }

  void sum(int a, int b, int c) {
    System.out.println(a + b + c);
  }

  void sum(String x, String y) {
    System.out.println(x + y);
  }
}

public class Day_13_04_Polymorphism {
  public static void main(String[] args) {
    OverLoadingDemo obj = new OverLoadingDemo();
    obj.sum(5, 8, 9);
    obj.sum(4, 6);
    obj.sum("ha", " Ji");
  }
}

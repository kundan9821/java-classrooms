
public class Day_13_02_Ovrloading {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static String sum(String x, String y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(sum(4, 6));
    System.out.println(sum(6, 8, 10));
    System.out.println(sum("We", " can"));
  }
}

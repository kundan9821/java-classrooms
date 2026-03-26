abstract class car {
  abstract public void fuelType();

  public void color() {
    System.out.println("Black Color");
  }
}

class tata extends car {
  public void fuelType() {
    System.out.println("Disel");
  }
}

public class Day_9_Abstraction {
  public static void main(String[] args) {
    tata nexon = new tata();
    nexon.fuelType();
    nexon.color();
  }

}

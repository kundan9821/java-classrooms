interface Car {
  public void start();
}

class ElectricCar implements Car {
  public void start() {
    System.out.println("Electic car Start");
  }
}

class DiselCar implements Car {
  public void start() {
    System.out.println(" Disel car to Start");
  }
}

public class Day_12_Interface_1 {
  public static void main(String[] args) {
    Car Tesla = new ElectricCar();
    Car Mahendra = new DiselCar();
    Tesla.start();
    Mahendra.start();
  }
}

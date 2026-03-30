class vechle {
  int price;
  String clour;
  String model;

  void display() {
    System.out.println(price);
    System.out.println(clour);
    System.out.println(model);
  }
}

class car extends vechle {
  String Brand;
  String length;
  boolean sunroof;

}

public class Day_11_inheretance_2 {
  public static void main(String[] args) {
    car car1 = new car();
    car1.Brand = "Tata";
    car1.clour = "Red";
    car1.model = "SUV";
    car1.price = 15000000;
    car1.length = "80inch";
    car1.display();
  }
}
